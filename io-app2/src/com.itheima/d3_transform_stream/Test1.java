package com.itheima.d3_transform_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {
    public static void main(String[] args) {
        try (
                // 代码和文件都是UTF-8编码
//                Reader fr = new FileReader("io-app2/src/com.itheima/itheima04.txt");
                Reader fr = new FileReader("io-app2/src/com.itheima/itheima06.txt");
                BufferedReader br = new BufferedReader(fr);
                ){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
