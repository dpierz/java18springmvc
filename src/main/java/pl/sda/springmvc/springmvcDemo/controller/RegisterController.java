package pl.sda.springmvc.springmvcDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.springmvc.springmvcDemo.dto.SignInFormDTO;

@Controller
@RequestMapping("/sign-in")
class RegisterController {

    @RequestMapping
    ModelAndView getSignInPage(){
        ModelAndView mnv = new ModelAndView("signIn");
        mnv.addObject("signInForm", new SignInFormDTO());
        return mnv;
    }

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    ModelAndView registerUser() {
        return new ModelAndView("redirect:/login");
    }
}
