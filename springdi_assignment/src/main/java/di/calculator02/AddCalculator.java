package di.calculator02;

public class AddCalculator implements Calculator {
	
	public AddCalculator() {
		System.out.println("더하기 생성자");
	}

	@Override
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}

}
