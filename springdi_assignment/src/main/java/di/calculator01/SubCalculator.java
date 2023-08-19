package di.calculator01;

public class SubCalculator implements Calculator{
	
	public SubCalculator() {
		System.out.println("빼기 생성자");
	}
	
	@Override
	public int calculate(int n1, int n2) {
		return n1 - n2;
	}

}
