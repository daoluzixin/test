package test4;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.UUID;

public class MyRunnable implements Runnable{
    Socket socket;

    public MyRunnable (Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
    //读取数据并保存到本地文件
        Scanner sc = new Scanner(System.in);
        try {
            OutputStream os = socket.getOutputStream(); //获取到输出流
            while (true) {
                System.out.println("请输入你想说的话");
                String str = sc.nextLine();
                if ("886".equals(str)) {
                    break;
                }
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                os.write(bytes);
        }

            //回写数据
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //先从连接通道中获取字节流,再转成字符流
            bw.write("聊天结束!");
            //  bw.newLine();
            bw.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //释放资源
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
