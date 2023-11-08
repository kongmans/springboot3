package com.kong.ssm.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginHandlerInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginuser = request.getSession().getAttribute("loginuser");
        if(loginuser==null){
            request.setAttribute("msg","请先登陆");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }
        else {
            return true;
        }

    }


}
