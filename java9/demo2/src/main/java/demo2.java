import java.io.*;
import java.util.List;

public class demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Song> songsList = Songs.getSongs();

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/songs.txt"));
            oos.writeObject(songsList);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/songs.txt")); //相对路径

        //读取数据
        List<Song> o = (List<Song>) ois.readObject();

        //打印对象
        System.out.println(o); //会自动调用类中的toString方法

        //释放资源
        ois.close();
    }
}



