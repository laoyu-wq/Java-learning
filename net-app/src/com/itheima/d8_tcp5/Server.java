package com.itheima.d8_tcp5;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static List<Socket> onLineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        // 1、创建ServerSocket对象，注册端口
        ServerSocket severSocket = new ServerSocket(8080);

        // 创建以一个线程池，负责处理通信管道的任务
        ThreadPoolExecutor pool = new ThreadPoolExecutor(16 * 2, 16 * 2, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            // 2、使用ServerSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = severSocket.accept();
            onLineSockets.add(socket);

            System.out.println("有人上线:\t" + socket.getRemoteSocketAddress());

            // 3、把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            pool.execute(new ServerReaderRunnable(socket));
        }


    }
}
