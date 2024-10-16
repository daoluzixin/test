# Task1

## Exception

1.NullPointerException(空指针异常)
发生原因：尝试访问或操作一个未初始化的对象（即为 null）

2.ArrayIndexOutOfBoundsException(数组下标越界)
发生原因：尝试访问数组中不存在的索引。

## Error

StackOverflowError(栈溢出)

发生原因：程序调用栈过深，通常是由于无限递归引起的。

Exception：通常是程序可以预料和处理的异常。应通过适当的错误处理机制（如 try-catch）来捕获和处理。

Error：通常是程序无法预料和恢复的严重问题。

### 区别

#### Checked exceptions 是在编译时检查的异常，必须在代码中显式处理。

**IOException**：用于指示发生输入/输出操作时出现的异常，如文件未找到或无法读取文件。

**SQLException**：表示数据库访问错误。

#### Unchecked exceptions 是在运行时检查的异常

**NullPointerException**：当尝试访问或操作一个为 null 的对象时抛出。
**ArrayIndexOutOfBoundsException**：当访问数组时索引超出范围时抛出。
**ArithmeticException**：在数学运算中发生错误，如除以零。



### 全局异常处理器

![](C:\Users\冯\Desktop\凌睿(图片勿移)\全局异常处理器.jpg)

统一管理异常

@ExceptionHandler 标记为异常处理方法, 可指定参数(异常类型或其他)

@ControllerAdvice 标记为全局异常处理器, 与@RestController 一起使用, 指定全局异常处理器只处理@RestController控制器抛出的异常