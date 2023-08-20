package di.calculator04;

import org.springframework.stereotype.Component;

@Component
public class DivideCalculator implements Calculator {

	public DivideCalculator() {
		System.out.println("나누기 생성자");
	}
	
	@Override
	public int calculate(int n1, int n2) {
		if (n2 == 0) {
            throw new ArithmeticException("0은 불가");
        }
		return n1 - n2;
	}

}
