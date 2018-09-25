package com.lancoder.feign.feignconsumer.filter;

import com.sun.net.httpserver.HttpExchange;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***********************************
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com 
 * @date: 2018-9-20  
 * @Description:
 * @version: V1.0
 ***********************************/
public class BaseFilter implements Filter {
    /**
     * 封装，不需要过滤的list列表
     */
    protected static List<Pattern> patterns = new ArrayList<Pattern>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        patterns.add(Pattern.compile("login/index.html"));
        patterns.add(Pattern.compile("login/login"));
        patterns.add(Pattern.compile("login.do"));
        patterns.add(Pattern.compile("main/autoFillty_rj_situation.*"));
        patterns.add(Pattern.compile("main/post.*"));
        patterns.add(Pattern.compile(".*[(\\.js)||(\\.css)||(\\.png)]"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        String url = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length());
        if (url.startsWith("/") && url.length() > 1) {
            url = url.substring(1);
        }
        if (isInclude(url)){
            filterChain.doFilter(httpRequest, httpResponse);
            return;
        } else {
            System.out.println(url);
            filterChain.doFilter(httpRequest,httpResponse);
        }
    }

    @Override
    public void destroy() {

    }
    /**
     * 是否需要过滤
     * @param url
     * @return
     */
    private boolean isInclude(String url) {
        for (Pattern pattern : patterns) {
            Matcher matcher = pattern.matcher(url);
            if (matcher.matches()) {
                return true;
            }
        }
        return false;
    }

}
