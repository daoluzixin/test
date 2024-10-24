package test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {

        //创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,  //核心线程数量
                16, //线程池总大小
                60, //空闲时间
                TimeUnit.MINUTES,  // 时间单位
                new ArrayBlockingQueue<>(2),    //队列
                Executors.defaultThreadFactory(),   //线程工程
                new ThreadPoolExecutor.AbortPolicy()    //阻塞队列
        );

        //创建对象并绑定端口
        ServerSocket ss = new ServerSocket(9999);
        while(true){
        //等待客户端连接
        Socket socket = ss.accept();

       //开启一条线程,对应一个用户
        //    new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
    }
}
}