package pl.sda.springmvc.springmvcDemo.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Builder
@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;

    //FIX TO SET!!!
    @ManyToMany
    private Set<OrderEntity> orders = new HashSet<>();

    public ProductEntity(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
