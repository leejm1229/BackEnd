package basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
    
    public static void main(String[] args) {

//        Hello hello = new Hello();
//        hello.printHello();
        // 1. Spring Container 생성
        // GenericXmlApplicationContext와 유사하게 동작하는 ClassPathXmlApplicationContext("basic-beanContainer.xml");
        ApplicationContext context = 
                new GenericXmlApplicationContext("basic-beanContainer.xml");
        
        // dependency 문법
        Hello h = (Hello)context.getBean("h1");
        
        h.printHello();
        
        // bean이 한 개만 있을 때
        Hello hh = context.getBean(Hello.class);
        
        hh.printHello();
        
        // 같은 bean이라는 뜻
        System.err.println(h);
        System.err.println(hh);
    }
    
    
}
