import java.util.Scanner;

public class yearTest {
    public static void main(String[] args) {
        System.out.println("请输入你要判断的年份");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if (year%4 == 0){
            System.out.println("该年份为闰年!     1");
        }else{
            System.out.println("该年份不为闰年!    2");
        }
    }
}
