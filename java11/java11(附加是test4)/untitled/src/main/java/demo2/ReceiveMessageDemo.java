package demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws Exception{
        //接收数据

        //创建DatagramSocket
        //接收时,绑定的端口要和发送的一致
        DatagramSocket ds = new DatagramSocket(10086);

        //接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp= new DatagramPacket(bytes, bytes.length); //后一个参数代表用数组的所有长度接收数据

        //该方法是阻塞的,执行到这里会死等
        ds.receive(dp);

        //解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("接收到数据" + new String(data, 0, len));
        System.out.println("该数据是从" + address + "这台电脑中的" + port + "这个端口发出的");
    }
}
