package com.itheima.d8_tcp5;

import java.io.*;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable{
    private Socket socket;

    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();
            ps.println("<div style=" +
                    "'color:red;font-size:120px;text-aligen:center'>" +
                    "黑马程序员666<div>");

            ps.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
