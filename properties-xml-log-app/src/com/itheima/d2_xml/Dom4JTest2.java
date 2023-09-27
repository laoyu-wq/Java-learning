package com.itheima.d2_xml;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Dom4JTest2 {
    public static void main(String[] args) {
        // 1、使用一个StringBUilder对象来拼接XML格式的数据
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<book>\r\n");
        sb.append("\t<name>").append("从入门到跑路").append("</name>\r\n");
        sb.append("\t<auther>").append("dlei").append("</auther>\r\n");
        sb.append("\t<price>").append(999.99).append("</price>\r\n");
        sb.append("</book>");

        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("properties-xml-log-app\\src\\com\\itheima\\book.xml"));
                ){
            bw.write(sb.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
