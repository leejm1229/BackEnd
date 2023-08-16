package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("basic-beanContainer.xml");
		Hello h = (Hello)context.getBean("h1");
		h.printHello();
		
		// 생성자는 한번만 출력된다.
		Hello hh = (Hello)context.getBean("h1");
		hh.printHello();

	}

}
