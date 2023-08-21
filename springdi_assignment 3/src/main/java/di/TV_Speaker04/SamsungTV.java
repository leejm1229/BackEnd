package di.TV_Speaker04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("SamsungTV")
public class SamsungTV implements TV{
	private Speaker leftSpeaker;
	private Speaker rightSpeaker;
	
	public SamsungTV() {
        System.out.println("SamsungTV() 생성자");
    }
    
    @Autowired
    public SamsungTV(@Qualifier("SamsungSpeaker") SamsungSpeaker speaker) {
       System.out.println("SamsungTV(SamsungSpeaker) 생성자");
       this.leftSpeaker = speaker;
       this.rightSpeaker = speaker;
    }
	
	public Speaker getLeftSpeaker() {
		return leftSpeaker;
	}

	public void setLeftSpeaker(Speaker leftSpeaker) {
		this.leftSpeaker = leftSpeaker;
	}

	public Speaker getRightSpeaker() {
		return rightSpeaker;
	}

	public void setRightSpeaker(Speaker rightSpeaker) {
		this.rightSpeaker = rightSpeaker;
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
		this.leftSpeaker.volumeUp();
		this.rightSpeaker.volumeUp();
		
	}

	@Override
	public void volumeDown() {
		this.leftSpeaker.volumeDown();
		this.rightSpeaker.volumeDown();
		
	}

	@Override
	public void printSpeakerBrand() {
		leftSpeaker.getBrand();
		rightSpeaker.getBrand();
		
	}

	

}
