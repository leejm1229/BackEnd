package kr.ac.kopo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    
    public HelloController() {
        System.out.println("생성");
    }
    @RequestMapping("/hello/hello")
    public ModelAndView hello() {
        System.out.println("/hello/hello 입장");
        ModelAndView mav = new ModelAndView("hello/hello");
        mav.addObject("msg", "helloworld");
        return mav;
    }
}

