package kr.ac.kopo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import kr.ac.kopo.member.vo.MemberVO;

//@Component
public class LoginInterceptor implements HandlerInterceptor {
    // loginIntercepter 라는 이름으로 인스턴스를 생성함.
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        
        // request.getServletPath();
        // request.getContextPath();
        // request.getQueryString();
        // handler;
        System.out.println(request.getServletPath() + request.getContextPath() + request.getQueryString() + handler);
        HttpSession session = request.getSession();
        MemberVO memberVO = (MemberVO)session.getAttribute("currentUser");
        if(memberVO == null) {
            //  .... springboard/login
            response.sendRedirect(request.getContextPath() + "/login");
            return false;  // false면, 아무짓도 안해. 
        }else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
    
}
