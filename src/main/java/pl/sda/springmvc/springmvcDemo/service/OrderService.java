package pl.sda.springmvc.springmvcDemo.service;

import java.util.List;

public interface OrderService {

    void placeOrder(List<Long> idProducts);
}
