package com.itheima.d5_data_stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamTest1 {
    public static void main(String[] args) {
        try (
                DataOutputStream dos =
                        new DataOutputStream(new FileOutputStream("io-app2\\src\\com.itheima\\itheima10out.txt"));
                ){
            dos.writeInt(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("赵泽远666");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
