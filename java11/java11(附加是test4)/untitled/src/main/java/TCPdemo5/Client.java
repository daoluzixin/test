package TCPdemo5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP 发送数据

        //1.创建Socket对象
        //创建对象时会连接服务端,连接不上会报错
        Socket socket = new Socket("127.0.0.1", 10001);

        //2.可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出数据
        os.write("你好你好".getBytes());

        //3.释放资源
        os.close();
        socket.close();
    }
}
