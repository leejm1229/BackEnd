package di.TV_Speaker02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main02 {
    public static void main(String[] args) {

        ApplicationContext context = 
                new GenericXmlApplicationContext("spring-TV_Speaker02.xml");
        
        SamsungTV stv = (SamsungTV)context.getBean("Stv");
        LGTV ltv = (LGTV)context.getBean("Ltv");
        
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