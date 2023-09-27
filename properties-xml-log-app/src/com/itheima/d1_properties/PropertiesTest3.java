package com.itheima.d1_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest3 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("properties-xml-log-app/src/com/itheima/user.txt"));
        if (properties.contains("李芳")){
            properties.setProperty("李芳","18");
        }
        properties.store(new FileWriter("properties-xml-log-app/src/com/itheima/user.properties"),"succeed");
    }
}
