package di.calculator01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main01 {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("spring-calculator01.xml");
        MyCalculator cal1 = (MyCalculator) context.getBean("add");
        MyCalculator cal2 = (MyCalculator) context.getBean("sub");
        MyCalculator cal3 = (MyCalculator) context.getBean("mul");
        MyCalculator cal4 = (MyCalculator) context.getBean("div");
       
        cal1.printResult();
        cal2.printResult();
        cal3.printResult();
        cal4.printResult();
	}
}
