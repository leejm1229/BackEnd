package kr.ac.kopo.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	// doGet()
	@GetMapping("/member/joinform")
	public String joinForm() {
		System.out.println("get들어옴");
		return "member/joinform";
	}

	// doPost()

	public String join(HttpServletRequest request) {

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		System.out.println("Post들어옴");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);

		request.setAttribute("member", member);

		return "member/join";
	}

	public String join2(HttpServletRequest request, @RequestParam("id") String id2,
			@RequestParam("password") String password2
	// String id = request.getParameter("id");
	// String password = request.getParameter("password");
	) {

		System.out.println("Post들어옴");

		MemberVO member = new MemberVO();
		member.setId(id2);
		member.setPassword(password2);

		request.setAttribute("member", member);

		return "member/join";
	}

//	@PostMapping("/member/join")
	public String join3(HttpServletRequest request, String id, String password
	// 이름이 같으면 RequestParam 생략 가능.
	) {

		System.out.println("Post들어옴");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);

		request.setAttribute("member", member);

		return "member/join";
	}

//	@PostMapping("/member/join")
	public String join4(MemberVO member) {
		System.out.println(member.getId() + " : " +member.getPassword());
		return "member/join";
	}
	
//	@PostMapping("/member/join")
	public String join5(@ModelAttribute("member") MemberVO member) {
		return "member/join";
	}
	
	@PostMapping("member/join")
	public ModelAndView join6(MemberVO member) {
		ModelAndView mav = new ModelAndView("member/join");
		mav.addObject("member", member);
		
		return mav;
	}

}
