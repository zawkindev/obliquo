package zawkin.me.obliquo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserDTO(
        String id,

        @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
        String username,

        @NotNull(message = "Password cannot be null")
        @Size(min = 8, message = "Password must be at least 8 characters")
        String password
) {
}
