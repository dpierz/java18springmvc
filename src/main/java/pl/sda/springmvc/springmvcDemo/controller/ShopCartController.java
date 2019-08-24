package pl.sda.springmvc.springmvcDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.springmvc.springmvcDemo.component.ShopCart;
import pl.sda.springmvc.springmvcDemo.exception.NotFoundProductException;

@Controller
@RequestMapping("/shopcart")
class ShopCartController {

    private final ShopCart shopCart;

    //@Autowired
    ShopCartController(ShopCart shopCart){
        this.shopCart = shopCart;
    }

    @RequestMapping
    ModelAndView getShopCartPage(){
        ModelAndView mnv = new ModelAndView("shopCart");
        mnv.addObject("products", shopCart.getProducts());
        return mnv;
    }

    @RequestMapping("/addproduct/{idProduct}")
    ModelAndView addProductToShopCart(@PathVariable long idProduct) throws NotFoundProductException {
        shopCart.addProduct(idProduct);
        return new ModelAndView("redirect:/shopcart");
    }

    @RequestMapping("/placeorder")
    ModelAndView placeOrder() {
        shopCart.placeOrder();
        return new ModelAndView("redirect:/shopcart");
    }
}
