package com.briup1.tomcat.common;

import java.io.*;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        prop.load(new BufferedInputStream(new FileInputStream(new File("src/com/briup1/tomcat/common/prop.properties"))));
        System.out.println(prop);

    }
}
