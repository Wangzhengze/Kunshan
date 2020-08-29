package com.briup1.tomcat.bean;

import com.briup1.tomcat.common.Service;
import com.briup1.tomcat.request.Request;
import com.briup1.tomcat.response.Response;

public class RegisterServlet implements Service {
    @Override
    public void service(Request request, Response response) {
        System.out.println("这是注册页面");
        try {
            response.forword("/success.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
