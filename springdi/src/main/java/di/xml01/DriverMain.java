package di.xml01;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
    public static void main(String[] args) {
        
        ApplicationContext context = 
                new GenericXmlApplicationContext("spring-xml01.xml");
        Car localcar = (Car)context.getBean("car");
        localcar.printTireBrand();
        Car localcar5 = (Car)context.getBean("car5");
        List<String> list = localcar5.getDriver();
        for(String string : list) {
            System.out.println(string);
        }
        
        Car localcar6 = (Car)context.getBean("car6");
        Map<String, String> map = localcar6.getMap();
        for (String entry : map.keySet()) {
            System.out.println(entry + ":" + map.get(entry));
        }
//        Car localcar2 =(Car)context.getBean("car2");
//        localcar2.printTireBrand();
        
//        Car localcar3 =(Car)context.getBean("car3");
//        localcar3.printTireBrand();
    }
}
