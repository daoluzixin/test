import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws Exception {
        ArrayList<Song> songList = new ArrayList<>(); //长度可变的集合
        String flag;
        System.out.println("是否要添加歌曲信息(Y or N)");
        Scanner s = new Scanner(System.in);
        flag = s.next();

        if (flag.equals("Y")) {
            add(songList);
            try {
                //true 追加内容管道,避免内容被覆盖
                FileWriter writer = new FileWriter("src/main/java/SongInformation", true);// 如果文件“Foo.txt“不存在，则会自动创建这个文件
                writer.write(String.valueOf(songList));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileReader fr = new FileReader("src/main/java/SongInformation");
        int i;
        while ((i = fr.read()) != -1) {
            // 将 int 转换为 char
            char c = (char) i;
            System.out.print(c);
        }
    }
        public static void add (ArrayList < Song > songArrayList) {
            Scanner sc = new Scanner(System.in);
            Song s = new Song();

            System.out.println("请输入歌曲title");
            String title = sc.next();
            s.setTitle(title);

            System.out.println("请输入歌曲artist");
            String artist = sc.next();
            s.setArtist(artist);

            System.out.println("请输入歌曲genre");
            String genre = sc.next();
            s.setGenre(genre);

            System.out.println("请输入歌曲year");
            String year = sc.next();
            s.setYear(Integer.parseInt(year));

            System.out.println("请输入歌曲timesPlayed");
            String timesPlayed = sc.next();
            s.setTimesPlayed(Integer.parseInt(timesPlayed));

            songArrayList.add(s); //将学生对象添加到集合中去

            System.out.println("歌曲信息录入成功!");
    }
}
