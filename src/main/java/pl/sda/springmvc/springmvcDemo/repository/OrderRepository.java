package pl.sda.springmvc.springmvcDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.springmvc.springmvcDemo.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
