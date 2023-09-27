package com.itheima.d7_tcp4;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1、创建Socket对象，并同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1",8888);

        // 创建一个独立的线程，负责随即从socket中接收服务端发送过来的消息
        new ClientReaderThread(socket).start();

        // 2、从socket通信管道中得到一个字节输出流，用来发程序给服务端程序
        OutputStream os = socket.getOutputStream();

        // 3、把低级的字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();

            // 一旦客户输出exit，立即退出
            if ("exit".equals(msg)){
                System.out.println("退出成功");
                dos.close();
                socket.close();
                break;
            }
            // 4、开始写数据出去了
            dos.writeUTF(msg);
            dos.flush();
        }


    }
}
