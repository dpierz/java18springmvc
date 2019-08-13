package pl.sda.springmvc.springmvcDemo.repository;

import pl.sda.springmvc.springmvcDemo.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    void addProduct(ProductEntity productEntity);
    List<ProductEntity> getProducts();
    Optional<ProductEntity> getProductById(long idProduct);
}
