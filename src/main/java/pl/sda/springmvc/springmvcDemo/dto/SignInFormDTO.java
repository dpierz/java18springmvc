package pl.sda.springmvc.springmvcDemo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignInFormDTO {
    private String login;
    private String password;
    private String repeatedPassword;
}
