package demo3;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo3 {
    public static void main(String[] args) throws Exception{
        //1.创建对象
        MulticastSocket ms = new MulticastSocket(10000);

        //将本机添加到224.0.0.1这一组中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //2.接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ms.receive(dp);

            //解析数据包
            byte[] data = dp.getData();
            int len = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();

            //打印数据
            System.out.println("ip为" + ip + ",主机名为:" + name + "的人,发送了数据: " + new String(data, 0, len));
        }
    }
}
