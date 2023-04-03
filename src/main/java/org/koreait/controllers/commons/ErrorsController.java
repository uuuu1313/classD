package org.koreait.controllers.commons;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    헤더에 응답 상태 코드 추가.
 */

@Controller
@RequestMapping("/error")
public class ErrorsController {
    @RequestMapping("/400")
    public String error400(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        return "error/400";
    }

    @RequestMapping("/401")
    public String error401(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return "error/401";
    }

    @RequestMapping("/403")
    public String error403(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
        return "error/403";
    }

    @RequestMapping("/404")
    public String error404(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        return "error/404";
    }

    @RequestMapping("/405")
    public String error405(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
        return "error/405";
    }

    @RequestMapping("/500")
    public String error500(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return "error/500";
    }

    @RequestMapping("/501")
    public String error501(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);
        return "error/501";
    }

    @RequestMapping("/502")
    public String error502(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_BAD_GATEWAY);
        return "error/502";
    }

    @RequestMapping("/503")
    public String error503(HttpServletResponse resp){
        resp.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
        return "error/503";
    }
}
