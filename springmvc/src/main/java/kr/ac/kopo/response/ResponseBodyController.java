package kr.ac.kopo.response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.form.MemberVO;

@RestController
public class ResponseBodyController {
	/*
	 	1. url
	 	2. bean 객체 생성
	 	3. @ResponseBody 붙이
	 */
	
	@ResponseBody
	@RequestMapping("/voresponse")
	public String voresponse() {
		MemberVO member = new MemberVO();
		member.setId("홍길동");
		member.setPassword("1111");
		return "OK";
	}
	
	@ResponseBody
	@RequestMapping("/stringresponse")
	public String response() {
		return "OK";
	}
}
