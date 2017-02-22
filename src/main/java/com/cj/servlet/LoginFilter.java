package com.cj.servlet;

import com.cj.entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by chenjing on 2017/2/22.
 */
public class LoginFilter implements Filter {
    private String exclueUrl;

    public void init(FilterConfig filterConfig) throws ServletException {
        exclueUrl = filterConfig.getInitParameter("execludeUrl");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //获取Session判断是否已登录
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        //如果是包含/login/的URL则不进行过滤
        String cc = request.getServletPath();
        if (request.getServletPath().contains(exclueUrl)){
            filterChain.doFilter(request,response);
            return;
        }
        User user = (User) session.getAttribute("user");
        if (user == null){
            response.sendRedirect(request.getContextPath() + "/login/toLogin.html");
            return;
        }
        filterChain.doFilter(request, response);
    }

    public void destroy() {

    }
}
