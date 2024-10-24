package demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class SendMessageDemo {
    public static void main(String[] args) throws Exception{
        //发送数据

        //创建DatagramSocket对象(快递公司)
        //绑定端口,以后通过这个端口往外发送
        //空参,所有可用端口中随机一个使用
        //有参:指定端口号绑定
        DatagramSocket ds = new DatagramSocket();

        //打包数据
        String str = "你好!";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        InetAddress address = InetAddress.getByName("113.54.247.67");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        //发送数据
        ds.send(dp);

        //释放资源
        ds.close();
    }
}
