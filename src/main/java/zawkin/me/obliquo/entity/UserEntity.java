package zawkin.me.obliquo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("users")
public class UserEntity {
    @Id
    private String id;
    private String username;
    private String password;
}
