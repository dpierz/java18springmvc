package pl.sda.springmvc.springmvcDemo.repository.impl;

import org.springframework.stereotype.Repository;
import pl.sda.springmvc.springmvcDemo.entity.ProductEntity;
import pl.sda.springmvc.springmvcDemo.repository.ProductRepository;

import java.util.*;

@Repository
public class InMemoryProductRepositoryImpl implements ProductRepository {

    private final Map<Long, ProductEntity> repo = new HashMap<>();
    private long index = 0;

    @Override
    public void addProduct(ProductEntity productEntity) {
        productEntity.setId(++index);
        repo.put(index, productEntity);
    }

    @Override
    public List<ProductEntity> getProducts() {
        return new ArrayList<>(repo.values());
    }

    @Override
    public Optional<ProductEntity> getProductById(long idProduct) {
        return Optional.ofNullable(repo.get(idProduct));
    }
}
