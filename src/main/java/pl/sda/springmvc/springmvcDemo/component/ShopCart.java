package pl.sda.springmvc.springmvcDemo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import pl.sda.springmvc.springmvcDemo.dto.ProductDTO;
import pl.sda.springmvc.springmvcDemo.exception.NotFoundProductException;
import pl.sda.springmvc.springmvcDemo.service.OrderService;
import pl.sda.springmvc.springmvcDemo.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShopCart {

    private List<ProductDTO> products = new ArrayList<>();

    private final ProductService productService;
    private final OrderService orderService;

    //@Autowired
    public ShopCart(ProductService productService, OrderService orderService) {
        this.productService = productService;
        this.orderService = orderService;
    }

    public List<ProductDTO> getProducts(){
        return products;
    }

    public void addProduct(long idProduct) throws NotFoundProductException {
        ProductDTO productById = productService.getProductById(idProduct);
        products.add(productById);
    }

    public void placeOrder() {
        List<Long> productsIds = products
                .stream()
                .map(ProductDTO::getId)
                //.map(dto -> dto.getId())
                .collect(Collectors.toList());
        orderService.placeOrder(productsIds);
        products.clear();
    }
}
