package com.javaweb.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @version : 1.0
 * @auther : xie     xyjworkgame@163.com
 * @Program Name: <br>
 * @Create : 2018-10-22-19:46
 */
//@WebFilter(filterName = "HelloFilter",urlPatterns = "/test.jsp")
public class HelloFilter implements Filter {
    public void destroy() {
        System.out.println("destory");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter");

        //放行：
        chain.doFilter(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {

        System.out.println("init ...");
    }

}
