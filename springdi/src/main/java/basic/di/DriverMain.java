package basic.di;

public class DriverMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		HankookTire hankook = new HankookTire();
		KumhoTire kumho = new KumhoTire();
		
		car.setTire(kumho);
		car.printTireBrand();
		
		Car car2 = new Car(hankook);
		car2.printTireBrand();
	}
}
