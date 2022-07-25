package com.whalefall.learncases.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author WhaleFall
 * @create 2022-07-25 22:11
 */
@Configuration
@Order(-1)
@WebFilter(urlPatterns = "/*", filterName = "logFilter2")
public class LogFilter2 implements Filter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Log Filter2 Execute cost="+(System.currentTimeMillis()-start));
    }
}
