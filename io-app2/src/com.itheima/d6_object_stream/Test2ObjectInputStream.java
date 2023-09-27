package com.itheima.d6_object_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2ObjectInputStream {
    public static void main(String[] args) {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io-app2\\src\\com.itheima\\itheima11out.txt"));
                ){
            User u = (User) ois.readObject();
            System.out.println(u);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
