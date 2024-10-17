import java.util.Collections;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<String> songs = MockSongs.getSongStrings();
        Collections.sort(songs);    //排序后的集合替换了原集合
        System.out.println(songs);
    }
}
