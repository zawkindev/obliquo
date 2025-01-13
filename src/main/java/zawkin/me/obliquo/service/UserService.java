package zawkin.me.obliquo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zawkin.me.obliquo.dto.UserDTO;
import zawkin.me.obliquo.exception.AlreadyRegistered;
import zawkin.me.obliquo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public Boolean registration(UserDTO user) {
        if (repository.findByUsername(user.username()) == null) {
            throw new AlreadyRegistered("Already registered! Try to log in");
        };

        repository.save(user);
    }
}
