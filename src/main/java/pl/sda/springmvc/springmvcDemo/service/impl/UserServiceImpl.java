package pl.sda.springmvc.springmvcDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.springmvc.springmvcDemo.dto.SignInFormDTO;
import pl.sda.springmvc.springmvcDemo.entity.UserEntity;
import pl.sda.springmvc.springmvcDemo.repository.UserRepository;
import pl.sda.springmvc.springmvcDemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    //@Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(SignInFormDTO signInFormDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setLogin(signInFormDTO.getLogin());
        userEntity.setPassword(signInFormDTO.getPassword());
        userRepository.save(userEntity)
;    }
}
