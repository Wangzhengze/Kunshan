package com.briup1.tomcat.common;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BeanFactory {
    private static Properties prop;

    static  {
        prop = new Properties();
        try {
            prop.load(new BufferedInputStream
                    (new FileInputStream
                            (new File("src/com/briup1/tomcat/common/conf.properties"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object getBean(String name) throws Exception {
        String className = prop.getProperty(name);
        if(className != null) {
            System.out.println(className);
            return Class.forName(className).newInstance();
        }
        return null;
    }
}
