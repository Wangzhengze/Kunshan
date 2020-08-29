package com.briup1.tomcat.bean;

import com.briup1.tomcat.request.Request;
import com.briup1.tomcat.response.Response;
import com.briup1.tomcat.common.Service;

public class LoginServlet implements Service {

    @Override
    public void service(Request request, Response response) {
        System.out.println("这是登录页面");
        try {
            response.forword("/login.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
