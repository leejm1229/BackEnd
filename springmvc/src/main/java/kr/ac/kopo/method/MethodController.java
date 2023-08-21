package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RequestMapping(value = "/method/method")
@Controller
public class MethodController {
    
    public MethodController(){
        System.out.println("MethodController 생성");
    }
    // doGet()
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        System.out.println("get들어옴");
        return "method/methodForm";
    }
    
    // doPost()
    @RequestMapping(method = RequestMethod.POST)
    public String post() {
        System.out.println("요청 받음");
        return "method/methodProcess";
    }
}
