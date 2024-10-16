import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int sum = 0;
        int t = 0;
        int nums = 0;
        try(
                Reader fr = new FileReader("C:\\Users\\冯\\Desktop\\微光\\java7\\demo\\src\\main\\data.txt");
                //创建一个字符缓冲输入流包装原始
                BufferedReader br = new BufferedReader(fr);
        ) {
            try {
                String line; //记住每次读取的一行数据
                while ((line = br.readLine()) != null) {
                    nums = Integer.parseInt(line);  //字符转换为整数
                }
            } catch (NumberFormatException e){
                System.out.println("文件格式错误");
            }finally {
                sum += nums;
                t++;
                if (sum == 0.0) {
                    throw new EmptyFileException("文件为空!");
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("文件未找到");
        }catch (EmptyFileException e) {
            System.out.println("文件为空");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("文件中所有整数的平均值为:");
            float average = sum / (float)t;
            System.out.println(average);
        }
    }
    static class EmptyFileException extends Exception {
        public EmptyFileException(String message) {
            super(message);
        }
    }

}