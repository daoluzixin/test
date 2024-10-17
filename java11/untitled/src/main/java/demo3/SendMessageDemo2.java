package demo3;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//广播
public class SendMessageDemo2 {
    public static void main(String[] args) throws Exception {
        /* 发送: 键盘录入,直到输入的是886,发送结束
           接收: 采用死循环接收
         */

        //1.创建DatagramSocket
        MulticastSocket ms = new MulticastSocket();

        //2.打包数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你想说的话");
            String str = sc.nextLine();
            if ("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

            InetAddress address = InetAddress.getByName("224.0.0.1");
            int port = 10000;

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            //发送数据
            ms.send(dp);
        }

        //释放资源
        ms.close();
    }
}
