package com.itheima.d5_tcp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        // 1、创建ServerSocket对象，注册端口
        ServerSocket severSocket = new ServerSocket(8888);

        while (true) {
            // 2、使用ServerSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = severSocket.accept();

            System.out.println("有人上线:\t" + socket.getRemoteSocketAddress());

            // 3、把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }


    }
}
