package di.xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 스프링으로 작업 
public class DriverMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("spring-xml01.xml");
		
		Car localcar = (Car)context.getBean("car");
		localcar.printTireBrand();
	}

}