package com.itheima.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1、创建一个客户端对象
        DatagramSocket socket = new DatagramSocket();

        // 2、创建数据包对象封装要发出去的对象
        /*public DatagramPacket(byte[] buf, int offset, int length,
            InetAddress address, int port)
            参数1：封装要发出去的数据
            参数2：发出去的数据的大小
            参数3：服务端的IP地址（找到服务端主机）
            参数4：服务端程序的端口
            */
        Scanner sc = new Scanner(System.in);
        while (true) {
//            byte[] bytes = "我是快乐的客户端，abc".getBytes();
            System.out.println("请说：");
            String msg = sc.nextLine();

            // 一旦客户输入的是exit命令，就退出客户端
            if ("exit".equals(msg)){
                System.out.println("欢迎下次光临，退出成功");
                socket.close();
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
                    InetAddress.getLocalHost(),6666);

            // 3、正式发送这个数据包的数据出去了
            socket.send(packet);
        }

//        System.out.println("客户端数据发送完毕");
//        socket.close();//释放资源
    }
}
