package di.TV_Speaker04;

import org.springframework.stereotype.Component;

@Component("SamsungSpeaker")
public class SamsungSpeaker implements Speaker {

	@Override
	public void volumeUp() {
		System.out.println("삼성 스피커 볼륨 업!!!");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("삼성 스피커 볼륨 다운!!!");
		
	}

	@Override
	public void getBrand() {
		System.out.println("삼성 스피커입니다.");
		
	}



}
