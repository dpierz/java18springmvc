package pl.sda.springmvc.springmvcDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.springmvc.springmvcDemo.entity.OrderEntity;
import pl.sda.springmvc.springmvcDemo.entity.ProductEntity;
import pl.sda.springmvc.springmvcDemo.repository.OrderRepository;
import pl.sda.springmvc.springmvcDemo.repository.ProductRepository;
import pl.sda.springmvc.springmvcDemo.service.OrderService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    //@Autowired
    public OrderServiceImpl(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @Transactional
    @Override
    public void placeOrder(List<Long> idProducts) {
        OrderEntity orderEntity = new OrderEntity();
        List<ProductEntity> products = idProducts
                .stream()
                .map(productRepository::getOne)
                .collect(Collectors.toList());

        for (ProductEntity productEntity : products) {
            productEntity.getOrders().add(orderEntity);
            //orderEntity.getProducts().add(productEntity);
        }
        orderRepository.save(orderEntity);
    }
}
