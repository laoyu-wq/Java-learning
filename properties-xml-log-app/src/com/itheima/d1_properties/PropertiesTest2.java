package com.itheima.d1_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("张无忌","minmin");
        properties.setProperty("殷素素","cuishan");
        properties.setProperty("张翠山","susu");

        properties.store(new FileWriter("properties-xml-log-app/src/com/itheima/users2.properties"),
                "sdhqwiuhdsiquwhduiq");
    }
}
