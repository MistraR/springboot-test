package com.spring.boot.test.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/22/022
 * Describe: 自定义拦截器 相当于servlet的filter
 */
public class MyInterceptor extends HandlerInterceptorAdapter {

    /**
     * 请求处理前执行
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    /**
     * 请求完成后执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为:" + new Long(endTime - startTime) + "ms");
        request.setAttribute("handlingTime", endTime - startTime);
    }
}
