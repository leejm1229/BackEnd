package kr.ac.kopo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.kopo.member.vo.MemberVO;

@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		HttpSession session = request.getSession();
		MemberVO memberVO = (MemberVO) session.getAttribute("currentUser");

		if (memberVO == null) {
			System.out.println("MemberVO is null");
			response.sendRedirect(request.getContextPath()+"/login");
			return false;
		} else {
			return true;
		}

//		System.out.println("preHandle - 로그인 체크 동작입니다.");
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle 동작입니다.");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

}
