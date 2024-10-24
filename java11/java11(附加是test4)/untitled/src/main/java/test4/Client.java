package test4;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端: 将本地文件上传到服务器并接收反馈
        //服务端: 接收客户端上传的文件后给出反馈

        //创建Socket对象
        Socket socket = new Socket("127.0.0.1", 9999);

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());  //转换流
       int b;
        while ((b = isr.read()) != -1){
            System.out.print((char) b );
        }

        //向服务器写出结束标志
        socket.shutdownOutput();

        //接收服务器回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //字节流转换成字符流再用缓冲流包裹
        String line = br.readLine();
        System.out.println(line);

        //释放资源
        socket.close();
    }
}
