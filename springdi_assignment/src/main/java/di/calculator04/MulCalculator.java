package di.calculator04;

import org.springframework.stereotype.Component;

@Component
public class MulCalculator implements Calculator {
	
	public MulCalculator() {
		System.out.println("곱하기 생성자");
	}
	
	@Override
	public int calculate(int n1, int n2) {
		return n1 * n2;
	}

}
