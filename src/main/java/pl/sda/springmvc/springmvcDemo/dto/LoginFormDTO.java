package pl.sda.springmvc.springmvcDemo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginFormDTO {
    private String username;
    private String password;
}
