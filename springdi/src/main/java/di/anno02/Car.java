package di.anno02;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

public class Car {
//    @Autowired -> spring
//    @Resource -> java EE
//    @Inject -> java EE
    
    // 타입과 클래스가 맞는가? 이름이 같은가?
//    @Autowired
    @Resource
    private Tire tire;
    
    public Car() {
        System.out.println("Car() 생성자");
    }
    
    public Car(Tire k) {
        System.out.println("Car(Tire k) 생성자");
       this.tire = k;
    }

    public Tire getTire() {
        return tire;
    }
    
    public void setTire(Tire tire) {
        this.tire = tire;
    }
    
    public void printTireBrand() {
        System.out.println("타이어 브랜드는 " + tire.getTireBrand());
    }
    
}
