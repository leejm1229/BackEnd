package kr.ac.kopo.member.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.LoginVO;
import kr.ac.kopo.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@GetMapping("/login")
	public String loginForm(Model model) {
		LoginVO loginVO = new LoginVO();
		model.addAttribute(loginVO);
		return "member/loginForm";
	}

	@PostMapping("/login")
	public String loginProcess(@Valid LoginVO loginVO, Errors errors, Model model) {
		
		if(errors.hasErrors()) { // 에러가 있는 경우 
			return "member/loginForm";  // 다시 로그인 페이지로 이동 
		}else {
			MemberVO memberVO = memberService.login(loginVO);
			if(memberVO == null) {
				System.out.println("id/password가 틀렸습니다.");
				model.addAttribute("msg", "id와 password를 다시 확인하세요.");
				return "member/loginForm";				
			}else {
				System.out.println("post login이 완료" + memberVO);
				return "redirect:/board";
			}
		}
	}
}
