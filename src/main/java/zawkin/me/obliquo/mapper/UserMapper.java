package zawkin.me.obliquo.mapper;

import org.mapstruct.Mapper;
import zawkin.me.obliquo.dto.UserDTO;
import zawkin.me.obliquo.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(UserEntity entity);

    UserEntity toEntity(UserDTO dto);
}
