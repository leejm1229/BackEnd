package di.calculator03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyCalculator {
	
	@Value("${firstNum}")
	private int firstNum;
	
	@Value("${secondNum}")
	private int secondNum;
	
	
	private Calculator calculator;
	
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
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
