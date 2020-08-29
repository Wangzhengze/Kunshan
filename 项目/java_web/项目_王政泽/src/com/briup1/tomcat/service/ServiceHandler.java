package com.briup1.tomcat.service;

import com.briup1.tomcat.request.Request;
import com.briup1.tomcat.response.Response;
import com.briup1.tomcat.common.BeanFactory;
import com.briup1.tomcat.common.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServiceHandler implements Runnable {
    private Socket socket;

    public ServiceHandler(Socket socket) {
        this.socket = socket;
        new Thread(this).start();
    }
    @Override
    public void run() {
        //获取socket读写流
        try {
           BufferedReader bs = new BufferedReader
                   (new InputStreamReader
                           (socket.getInputStream()));
           PrintStream ps = new PrintStream
                   (socket.getOutputStream());
           //获取request和response对象
           Request request = new Request(bs);
           Response response = new Response(ps);
           //如果请求的url是以.action结尾的，进行字符串的截取
            // login.action  ->  login   servlet
           if(request.getUrl().endsWith(".action")) {
               String className = request.getUrl().substring(
                       1,request.getUrl().indexOf("."));
               Service s = (Service) BeanFactory.getBean(className);
               s.service(request,response);
           } else {
               //如果不是指定的action就直接找文件
               response.forword(request.getUrl());
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
