package zawkin.me.obliquo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zawkin.me.obliquo.entity.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByUsername(String username);
}
