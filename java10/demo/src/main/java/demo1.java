import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //	通过IP地址和TCP端口号创建一个对象并打开通道
        InetSocketAddress serverAddress = new InetSocketAddress(" 113.54.235.9", 5000);	//这里是举例
        SocketChannel socketChannel = SocketChannel.open(serverAddress);

        //建立一个与服务器的链接
        SocketAddress serverAddr1 = new InetSocketAddress("127.0.0.1", 5000);
        SocketChannel socketChannel1 = SocketChannel.open(serverAddr1);
        //从这个链接创建并获取一个Reader
        Reader reader = Channels.newReader(socketChannel1, StandardCharsets.UTF_8);//reader是底层字节流和高层字符流的桥梁
        //创建或获取一个BufferReader并读取
        BufferedReader bufferedReader = new BufferedReader(reader);//将BufferReader串联到reader
        String message = bufferedReader.readLine();

        //建立一个与服务器的链接
        SocketAddress serverAddr2 = new InetSocketAddress("127.0.0.1", 5000);
        SocketChannel socketChannel2 = SocketChannel.open(serverAddr2);
//从这个链接创建并获取一个Writer
        Writer writer = Channels.newWriter(socketChannel2, StandardCharsets.UTF_8);
//创建一个PrintWriter并打印一些内容
        PrintWriter printWriter = new PrintWriter(writer);
        System.out.println(123);
        System.out.println(213);
    }
}
