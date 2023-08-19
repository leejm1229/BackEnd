package di.TV_Speaker04;

import org.springframework.stereotype.Component;

@Component("BOSpeaker")
public class BOSpeaker implements Speaker{

	@Override
	public void volumeUp() {
		System.out.println("BOSpeaker 볼륨 업!!!");
		
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
