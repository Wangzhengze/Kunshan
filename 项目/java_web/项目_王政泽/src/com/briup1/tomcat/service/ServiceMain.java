package com.briup1.tomcat.service;

import com.briup1.tomcat.common.PropFinder;
import com.briup1.tomcat.common.PropFinder;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceMain {
    private Integer port;

    //初始化
    public ServiceMain() {
        this.port = Integer.parseInt
                (PropFinder.getProp("port"));
    }

    public void receive() throws IOException {
        ServerSocket server = new ServerSocket(port);
        System.out.println("服务器已经开启");
        while(true) {
            //接收客户端传来的数据
            Socket socket = server.accept();
            new ServiceHandler(socket);
        }
    }

    public static void main(String[] args) throws IOException {
        ServiceMain main = new ServiceMain();
        main.receive();
    }
}
