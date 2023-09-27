package com.itheima.d4_tcp1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        // 1、创建ServerSocket对象，注册端口
        ServerSocket severSocket = new ServerSocket(8888);

        // 2、使用ServerSocket对象，调用一个accept方法，等待客户端的连接请求
        Socket socket = severSocket.accept();

        // 3、从socket通信管道中得到一个字节输入流
        InputStream is = socket.getInputStream();

        // 4、把原始的字节输入流包装成数据输入流
        DataInputStream dis = new DataInputStream(is);

        // 5、使用数据输入流读取客户端发送过来的消息
        String rs  = dis.readUTF();
        System.out.println(rs);
        // 其实我们可以获取客户端的IP地址
        System.out.println(socket.getRemoteSocketAddress());

        dis.close();
        socket.close();

    }
}
