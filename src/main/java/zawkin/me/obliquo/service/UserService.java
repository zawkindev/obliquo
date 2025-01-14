package zawkin.me.obliquo.service;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zawkin.me.obliquo.dto.UserDTO;
import zawkin.me.obliquo.entity.UserEntity;
import zawkin.me.obliquo.exception.AlreadyRegistered;
import zawkin.me.obliquo.exception.UsernameOrPasswordWrong;
import zawkin.me.obliquo.mapper.UserMapper;
import zawkin.me.obliquo.repository.UserRepository;

import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper mapper;

    public Boolean registration(UserDTO user, HttpServletRequest request) {
        if (repository.findByUsername(user.username()) != null) {
            throw new AlreadyRegistered("Username is already registered! Try logging in.");
        }
        repository.save(mapper.toEntity(user));
        request.getSession().setAttribute("user", user);
        return true;
    }

    public Boolean login(UserDTO user, HttpServletRequest request) {
        if (user.username() == null && user.password() == null) {
            throw new UsernameOrPasswordWrong("Invalid username or password");
        }
        UserEntity entity = repository.findByUsername(user.username());
        if (entity == null || !Objects.equals(entity.getPassword(), user.password())) {
            throw new UsernameOrPasswordWrong("Invalid username or password");
        }
        request.getSession().setAttribute("user", user);
        return true;
    }
}
