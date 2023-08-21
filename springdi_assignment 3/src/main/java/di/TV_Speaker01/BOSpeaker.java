package di.TV_Speaker01;

public class BOSpeaker implements Speaker {

	
	public BOSpeaker() {
		System.out.println("BOSpeaker 생성자");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("BOSpeaker 볼륨 업!!");
	}

	@Override
	public void volumeDown() {
		System.out.println("BOSpeaker 볼륨 다운!!!");
	}

	@Override
	public void getBrand() {
		System.out.println("브랜드는 BOSpeaker 입니다.");
		
	}

}
