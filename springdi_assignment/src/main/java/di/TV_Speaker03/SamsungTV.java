package di.TV_Speaker03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stv")
public class SamsungTV implements TV{
	
	private Speaker leftSpeaker;
	private Speaker rightSpeaker;
	
	public SamsungTV() {
        System.out.println("SamsungTV() 생성자");
    }
	
	@Autowired
	public SamsungTV(@Qualifier("SamsungSpeaker") Speaker speaker) {
        System.out.println("SamsungTV() 생성자");
        this.leftSpeaker = speaker;
        this.rightSpeaker = speaker;
    }
	
	@Override
	public void powerOn() {
		System.out.println("삼성TV 파워 온!!!");
	}

	@Override
	public void powerOff() {
		System.out.println("삼성TV 파워 오프!!!");
	}

	@Override
	public void volumeUp() {
		leftSpeaker.volumeUp();
		rightSpeaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		leftSpeaker.volumeDown();
		rightSpeaker.volumeDown();
	}

	@Override
	public void printSpeakerBrand() {
		leftSpeaker.getBrand();
		rightSpeaker.getBrand();
	}
}
