package pl.sda.springmvc.springmvcDemo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "ORDER_")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime creationDate = LocalDateTime.now();

    //FIX TO SET!!!
    @ManyToMany(mappedBy = "orders")
    private Set<ProductEntity> products = new HashSet<>();
}
