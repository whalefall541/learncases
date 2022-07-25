package com.whalefall.learncases.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author WhaleFall
 * @create 2022-07-25 22:08
 */
public class LogFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Log Filter1 Execute cost="+(System.currentTimeMillis()-start));
    }

}
