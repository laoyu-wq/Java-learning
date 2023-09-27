package com.itheima.d1_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        System.out.println(properties);

        properties.load(new FileReader("properties-xml-log-app\\src\\com\\itheima\\users.properties"));
        System.out.println(properties);

        System.out.println(properties.getProperty("赵敏"));
        System.out.println(properties.getProperty("张无忌"));

        // 遍历全部键值
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "---->" + value);
        }

        properties.forEach((k,v) -> {
            System.out.println(k + "---->" + v);
        });
    }
}
