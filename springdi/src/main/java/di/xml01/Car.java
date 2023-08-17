package di.xml01;

import java.util.List;
import java.util.Map;

public class Car {
    
    private Tire tire;
    String carName;
    int year;
    List<String> driver;
    Map<String, String> map;
    
    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getDriver() {
        return driver;
    }

    public void setDriver(List<String> driver) {
        this.driver = driver;
    }

    public Car() {
        System.out.println("Car() 생성자");
    }

    public Car(Tire k) {
       System.out.println("Car(Tire k) 생성자");
       this.tire = k;
    }
    public Car(String carname, Tire t) {
        System.out.println("Car(String carname, Tire t) 생성자");
        this.tire = t;
    }
    
    public Car(Tire t, String carname) {
        System.out.println("Car(Tire t, String carname) 생성자");
        this.tire = t;
    }
    public Car(String carname, int year, Tire t) {
        System.out.println("Car(String carname, int year, Tire t) 생성자");
        this.tire = t;
    }
    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        System.out.println("이것은 setTire(Tire tire) 입니다");
        this.tire = tire;
    }
    
    public void printTireBrand() {
        System.out.println("타이어 브랜드는 " + tire.getTireBrand());
    }
    
}
