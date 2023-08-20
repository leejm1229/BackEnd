package di.calculator04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main04 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MyCalculator cal1 = context.getBean("addCal" ,MyCalculator.class);
		MyCalculator cal2 = context.getBean("subCal", MyCalculator.class);
		MyCalculator cal3 = context.getBean("mulCal", MyCalculator.class);
		MyCalculator cal4 = context.getBean("divCal", MyCalculator.class);


        cal1.printResult();
        cal2.printResult();
        cal3.printResult();
        cal4.printResult();
	}
}
