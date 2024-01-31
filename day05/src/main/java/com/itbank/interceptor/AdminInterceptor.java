package com.itbank.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// 1) 인터셉터의 모든 기능을 직접 구현할 수 없으므로, 만들어진 클래스/인터페이스를 상속/구현한다.
public class AdminInterceptor /*1*/implements HandlerInterceptor{

	// 2) 메뉴를 클릭했을 때, 로그인 상태에 따라 컨트롤러의 함수를 실행하지 않아야 하므로 preHandle을 사용한다.
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	
		// 3) 조건을 판별하기 위해 필요한 값을 불러온다.
		
		
		}
		
			
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
}
