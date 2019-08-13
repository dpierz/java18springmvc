package pl.sda.springmvc.springmvcDemo.mapper;

import pl.sda.springmvc.springmvcDemo.dto.NewProductDTO;
import pl.sda.springmvc.springmvcDemo.dto.ProductDTO;
import pl.sda.springmvc.springmvcDemo.entity.ProductEntity;

public class ModelMapper {

    public ProductEntity map(NewProductDTO newProductDTO){
        return ProductEntity.builder()
                .name(newProductDTO.getName())
                .price(newProductDTO.getPrice())
                .build();
    }

    public static ProductDTO map(ProductEntity productEntity){
        return new ProductDTO(productEntity);
    }
}
