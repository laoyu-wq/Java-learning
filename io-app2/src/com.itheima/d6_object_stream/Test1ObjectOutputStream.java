package com.itheima.d6_object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1ObjectOutputStream {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos =
                        new ObjectOutputStream(new FileOutputStream("io-app2\\src\\com.itheima\\itheima11out.txt"));
                ){
            User u = new User("admin","张三",32,"666888");

            oos.writeObject(u);
            System.out.println("序列化对象成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
