package pl.sda.springmvc.springmvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
class HomeController {

    @RequestMapping
    ModelAndView getIndexPage(){
        ModelAndView mnv = new ModelAndView();
        mnv.setViewName("index");
        mnv.addObject("userName", "Michal");
        return mnv;
    }

}
