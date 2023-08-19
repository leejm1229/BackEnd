package di.TV_Speaker01;


public class SamsungSpeaker implements Speaker {
	
	public SamsungSpeaker() {
		System.out.println("삼성스피커 생성자");
	}

	@Override
	public void volumeUp() {
		System.out.println("삼성스피커 볼륨 업!!!");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("삼성스피커 볼륨 다운!!!");
		
	}

	@Override
	public void getBrand() {
		System.out.println("브랜드는 삼성스피커입니다.");
		
	}
}
