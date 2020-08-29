package com.briup1.tomcat.request;

import java.io.BufferedReader;

public class Request {
    //用于存储访问的url method keyvalue等参数
    //读取的请求资源
    private String url;
    //获取请求方法
    private String method;
    //socket读取流
    private BufferedReader br;
    //获取长度
    private Integer length = 0;
    //读取体部内容
    private String keyValue;

    public Request(BufferedReader br) throws Exception {
        //Request仅用于解析请求
        //请求内容
//        GET /login.action HTTP/1.1
//        Host: localhost:8888
//        Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
//        Upgrade-Insecure-Requests: 1
//        Cookie: Idea-39d73c57=f173e6c4-27aa-4a7b-adc8-2b235a8a376d; Idea-71f9beee=938291f6-ce1d-443c-9c48-ccd10faa53ff
//        User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.1.2 Safari/605.1.15
//        Accept-Language: zh-cn
//        Accept-Encoding: gzip, deflate
//        Connection: keep-alive
        this.br = br;
        String head = br.readLine();
        //GET /login.action HTTP/1.1
        String[] arr = head.split(" ");
        this.method = arr[0];
        this.url = arr[1];
//        System.out.println("以下为请求的格式内容");
        System.out.println(head);
        while (br.ready()) {
            String line = br.readLine();
//            System.out.println(line);
            if (method.equalsIgnoreCase("post")) {
                //post 请求 暂时我只需要 判断了个寂寞
                if ((line.indexOf("Content-Length") != -1)) {
//                    System.out.println(line);
                    length = Integer.valueOf(line.split(":")[1].trim());
                }
            }
//            System.out.println("退出");
            if ("".equals(line)) {
                break;
            }
        }
        //读取体部内容
        keyValue = "";
        for (int i = 0; i < length; i++) {
            keyValue = keyValue + (char) br.read();
        }
        //username=asd&password=asd&gender=on
//        System.out.println(keyValue);
    }

    public String getUrl(){
        return url;
    }

    public String getMethod(){
        return method;
    }

}

