package org.koreait.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class TestInterceptor implements HandlerInterceptor {
    // preHandle : 컨트롤러 실행 전

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String[] addCss = {"admin","error"};
        String[] addScript = {"admin","error"};
        request.setAttribute("addCss",addCss);
        request.setAttribute("addScript",addScript);
        return true;
    }

    // postHandle : 컨트롤러 실행 직후, 뷰 실행 전

    // afterCompletion : 뷰 실행 직후
}
