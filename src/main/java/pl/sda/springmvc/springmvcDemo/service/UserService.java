package pl.sda.springmvc.springmvcDemo.service;

import pl.sda.springmvc.springmvcDemo.dto.SignInFormDTO;

public interface UserService {
    void createUser(SignInFormDTO signInFormDTO);
}
