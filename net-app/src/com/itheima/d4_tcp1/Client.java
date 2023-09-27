package com.itheima.d4_tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1、创建Socket对象，并同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1",8888);

        // 2、从socket通信管道中得到一个字节输出流，用来发程序给服务端程序
        OutputStream os = socket.getOutputStream();

        // 3、把低级的字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        // 4、开始写数据出去了
        dos.writeUTF("在一起，好吗");
        dos.close();

        socket.close();
    }
}
