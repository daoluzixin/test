import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
    /*    List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();
        //调用流API的方法，例如我们希望最多有4个元素
        Stream<String> limit = stream.limit(4);
        //最后我们打印结果
        System.out.println("limit = " + limit.forEach(s -> System.out.println(s)));
     */
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        // 使用 collect 终端操作来获取流中的元素
        List<String> limitedList = limit.collect(Collectors.toList());
        // 现在打印 limitedList
        System.out.println("limit = " + limitedList);
    }
}
