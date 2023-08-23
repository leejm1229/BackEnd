package kr.ac.kopo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    public HelloController() {
        System.out.println("생성");
    }
    
    @RequestMapping("hello/{no}")
    public String pathv(@PathVariable("no") int n, Model model) {
    	System.out.println("n : " + n);
    	model.addAttribute("n", n);
    	return "hello/hello";
    }
}

