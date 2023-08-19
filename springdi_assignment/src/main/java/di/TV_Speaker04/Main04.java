package di.TV_Speaker04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main04 {
    public static void main(String[] args) {

        ApplicationContext context = 
                new AnnotationConfigApplicationContext(Config.class);
        
        SamsungTV stv = context.getBean("SamsungTV", SamsungTV.class);
        LGTV ltv = context.getBean("LGTV", LGTV.class);
        
        stv.powerOn();
        stv.volumeUp();
        stv.getLeftSpeaker().getBrand();
        stv.getRightSpeaker().volumeUp();
        stv.printSpeakerBrand();
        
        ltv.powerOn();
        ltv.volumeUp();
        ltv.getLeftSpeaker().getBrand();
        ltv.getRightSpeaker().volumeUp();
        ltv.printSpeakerBrand();
    }

}