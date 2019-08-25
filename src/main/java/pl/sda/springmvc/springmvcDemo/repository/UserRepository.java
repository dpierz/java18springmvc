package pl.sda.springmvc.springmvcDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.springmvc.springmvcDemo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
