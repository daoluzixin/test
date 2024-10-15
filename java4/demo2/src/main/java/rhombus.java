import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        System.out.println("请输入你想要得到的菱形高度(只能为奇数):");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        printHollowDiamond(n);
    }

    public static void printHollowDiamond(int n) {
        int spaces = n / 2;

        // 上半部分
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            spaces--;
        }

        // 下半部分
        spaces = 1;
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            spaces++;
        }
    }
}

