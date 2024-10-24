package UDPtest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws Exception {
        /* 发送: 键盘录入,直到输入的是886,发送结束
           接收: 采用死循环接收
         */

        //1.创建DatagramSocket
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你想说的话");
            String str = sc.nextLine();
            if ("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            //发送数据
            ds.send(dp);
        }

        //释放资源
        ds.close();
    }
}
