package com.briup1.tomcat.common;

import com.briup1.tomcat.request.Request;
import com.briup1.tomcat.response.Response;

public interface Service {
    void service(Request request, Response response);
}
