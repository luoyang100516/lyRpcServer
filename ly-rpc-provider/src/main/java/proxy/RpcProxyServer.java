package proxy;

import service.ProcessorHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.*;

public class RpcProxyServer {
    public void publish(Object service,int port){
        //通信阻塞 导致其他连接进不来 简历线程池处理连接
        ExecutorService executorService = newCachedThreadPool();

        ServerSocket serverSocket;
        try {
            //监听端口 连接阻塞
            //NIO -> new IO ->No Block IO
            //Selector 多路复用器 | 一个线程 管理N个连接 epoll
            serverSocket = new ServerSocket(port);
            while(true){
                //服务端代码执行到此，说明有客户端连接进来
                Socket socket = serverSocket.accept();
                executorService.submit(new ProcessorHandler(socket,service));


//                //开始通信 IO阻塞
//                socket.getInputStream();//输入流
//                socket.getOutputStream();//输出流
//                //BIO->阻塞IO ↑ ↑
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
