package di.TV_Speaker02;

public class SamsungTV implements TV{
	private Speaker leftSpeaker;
	private Speaker rightSpeaker;
	
	
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
