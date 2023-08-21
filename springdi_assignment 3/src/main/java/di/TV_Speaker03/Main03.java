package di.TV_Speaker03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main03 {
    public static void main(String[] args) {

        ApplicationContext context = 
                new GenericXmlApplicationContext("spring-TV_Speaker03.xml");
        
        
        SamsungTV stv = context.getBean("stv", SamsungTV.class);
        LGTV ltv = context.getBean("ltv", LGTV.class);
        
        
        stv.powerOn();
        stv.powerOff();
        stv.volumeUp();
        stv.volumeDown();
        stv.printSpeakerBrand();
        
        ltv.powerOn();
        ltv.powerOff();
        ltv.volumeUp();
        ltv.volumeDown();
        ltv.printSpeakerBrand();
        
    }

}