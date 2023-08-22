package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodController2 {
    
    public MethodController2(){
        System.out.println("MethodController 생성");
    }
    
//    // doGet()
//    @GetMapping("/method/method")
//    public String get() {
//        System.out.println("get들어옴");
//        return "method/methodForm";
//    }
//    
//    // doPost()
//    @PostMapping("/method/method")
//    public String post() {
//        System.out.println("요청 받음");
//        return "method/methodProcess";
//    }
}
