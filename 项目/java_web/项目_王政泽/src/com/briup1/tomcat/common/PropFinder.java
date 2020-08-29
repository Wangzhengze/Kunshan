package com.briup1.tomcat.common;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFinder {
    private static Properties prop;

    static {
        prop = new Properties();
        try {
            prop.load(new BufferedInputStream
                    (new FileInputStream
                            (new File("src/com/briup1/tomcat/common/prop.properties"))));
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println("aaa");
//        System.out.println(prop);
    }

    public static String getProp(String name) {
        return prop.getProperty(name);
    }
}
