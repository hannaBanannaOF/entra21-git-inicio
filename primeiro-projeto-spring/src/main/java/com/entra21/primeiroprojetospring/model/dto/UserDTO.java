package com.entra21.primeiroprojetospring.model.dto;

import com.entra21.primeiroprojetospring.model.entity.UserEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String login;
    private String password;

    public UserDTO(UserEntity e) {
        this.id = e.getId();
        this.login = e.getLogin();
        this.password = e.getPassword();
    }
}
