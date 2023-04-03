package org.koreait.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.function.StringFunc01;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.File;

public class CommonInterceptor implements HandlerInterceptor {
    // preHandle : 컨트롤러 실행 전

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object[] addCss = StringFunc01.subStringFileName("css");
        Object[] addScript = StringFunc01.subStringFileName("js");
        request.setAttribute("addCss",addCss);
        request.setAttribute("addScript",addScript);
        return true;
    }

    // postHandle : 컨트롤러 실행 직후, 뷰 실행 전

    // afterCompletion : 뷰 실행 직후
}
