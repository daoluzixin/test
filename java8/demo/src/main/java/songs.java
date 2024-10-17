import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor    //这里的注解代表类的构造器（全参）以及所有数据的get和set函数,建议自己写代码实现构造器和get
    public class songs{
        private String title;
        private String artist;
        private int bpm;
    }

