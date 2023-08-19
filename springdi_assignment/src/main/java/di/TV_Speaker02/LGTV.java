package di.TV_Speaker02;

import org.springframework.beans.factory.annotation.Autowired;


public class LGTV implements TV{
	private Speaker leftSpeaker;
	private Speaker rightSpeaker;

	public LGTV() {
        System.out.println("LGTV() 생성자");
    }
    
    @Autowired
    public LGTV(Speaker lefspeaker, Speaker rightspeaker) {
       System.out.println("LGTV 생성자");
       this.leftSpeaker = lefspeaker;
       this.rightSpeaker = rightspeaker;
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
		System.out.println("LGTV 파워 온!!!");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV 파워 오프!!!");
		
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
