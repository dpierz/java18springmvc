package pl.sda.springmvc.springmvcDemo.entity;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class ProductEntity {
    private long id;
    private String name;
    private BigDecimal price;
}
