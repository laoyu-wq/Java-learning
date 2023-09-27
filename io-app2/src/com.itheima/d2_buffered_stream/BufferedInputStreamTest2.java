package com.itheima.d2_buffered_stream;

import java.io.*;

public class BufferedInputStreamTest2 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("io-app2\\src\\com.itheima\\itheima04.txt");
                BufferedReader br = new BufferedReader(fr);
        ){
//            char[] buffer = new char[3];
//            int len;
//            while ((len = br.read(buffer)) != -1){
////                bos.write(buffer,0,len);
//                System.out.println(new String(buffer,0,len));
//            }

//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
