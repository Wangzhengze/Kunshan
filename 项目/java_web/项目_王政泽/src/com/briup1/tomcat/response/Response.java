package com.briup1.tomcat.response;

import com.briup1.tomcat.common.PropFinder;

import java.io.*;

public class Response {
    //路径名
    private String path;
    //请求路径
    private String url;
    private PrintStream out;
    private String welcomeUrl;
    private String errorUrl;

    public Response(PrintStream out) {
        this.out = out;
        path = PropFinder.getProp("path");
        welcomeUrl = PropFinder.getProp("welcomeUrl");
        errorUrl = PropFinder.getProp("errorUrl");
    }

    public void forword() throws Exception {
        if(url.equals("/")) {
            url = welcomeUrl;
        }

        File file = new File(path, url);
        if(file.exists()) {
            BufferedInputStream br =
                    new BufferedInputStream
                            (new FileInputStream(file));
            out.println("HTTP/1.1 200 OK");
            out.println();
            byte[] buff = new byte[1024];
            int len = 0;
            while((len = br.read(buff)) != -1) {
                out.write(buff,0,len);
                out.flush();
            }
            out.close();
        } else {
            BufferedInputStream br =
                    new BufferedInputStream
                            (new FileInputStream
                                    (new File
                                            (path, errorUrl)));
            out.println("HTTP/1.1 404 Not Found");
            out.println();
            byte[] buff = new byte[1024];
            int len = 0;
            while((len = br.read(buff)) != -1) {
                out.write(buff,0,len);
                out.flush();
            }
            out.close();
        }

    }

    public void forword(String url) throws Exception {
        System.out.println(url);
        this.url = url;
        forword();
    }
}
