package di.calculator04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyCalculator {
	
	@Value("20")
	private int firstNum;
	
	@Value("10")
	private int secondNum;
	
	private Calculator calculator;
	
	@Bean("addCal")
    public MyCalculator addCalculator() {
        MyCalculator cal = new MyCalculator();
        cal.setCalculator(new AddCalculator());
        return cal;
    }
	
	@Bean("subCal")
    public MyCalculator subCalculator() {
        MyCalculator cal = new MyCalculator();
        cal.setCalculator(new SubCalculator());
        return cal;
    }
	
	@Bean("mulCal")
    public MyCalculator mulCalculator() {
        MyCalculator cal = new MyCalculator();
        cal.setCalculator(new MulCalculator());
        return cal;
    }
	
	@Bean("divCal")
    public MyCalculator divCalculator() {
        MyCalculator cal = new MyCalculator();
        cal.setCalculator(new DivideCalculator());
        return cal;
    }
	
	

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void printResult() {
		System.out.println("결과는 " + calculator.calculate(this.firstNum, this.secondNum));
	}

}
