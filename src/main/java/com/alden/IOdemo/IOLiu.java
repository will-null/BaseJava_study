package com.alden.IOdemo;

import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class IOLiu {

    @Test
    public void FuWu() throws Exception {
        ServerSocket serverSocket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        Socket socket = null;

        serverSocket = new ServerSocket(8080);
        //持续监听
        while (true) {
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            byte[] rr = new byte[1024];
            while (inputStream.read(rr) > 0) {    //可能会阻塞(同步阻塞io)
                System.out.println(new String(rr));
                outputStream.write("ok".getBytes());
            }


        }


    }


}
