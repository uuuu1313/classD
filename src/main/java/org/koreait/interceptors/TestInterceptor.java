package org.koreait.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

public class TestInterceptor implements HandlerInterceptor {
    // preHandle : 컨트롤러 실행 전

    // postHandle : 컨트롤러 실행 직후, 뷰 실행 전

    // afterCompletion : 뷰 실행 직후
}
