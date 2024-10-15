# Task1

java为强类型语言

## 基本数据类型

表示真实的数字、字符和整数。

### 整数类型

byte：1字节，范围为 -128 到 127。
short：2字节，范围为 -32,768 到 32,767。
int：4字节，范围为 -2,147,483,648 到 2,147,483,647。
long：8字节，范围为 -9,223,372,036,854,775,808 到 9,223,372,036,854,775,807

### 浮点类型

float 4字节

double 8字节

### 字符类型

char 2字节

**boolean类型**  true和false

String为类

位(bit)  内部数据储存的最小单位 10010001  8位二进制数

字节(byte)  数据处理的最小单位(B)



**浮点数**: 有限离散  舍入误差  接近但不等于,少用浮点数比较

equals:判断字符串是否相等



## 引用数据类型

用于存储对象引用（或称为句柄），而不是直接存储对象本身。这些类型用于创建和操作对象。

类  接口 数组



## 数据类型转换

**自动类型转换**：当较小的数据类型被赋值给较大的数据类型时，Java会自动进行转换。例如，int可以自动转换为long，因为没有数据丢失。

**强制类型转换**：当较大的数据类型被赋值给较小的数据类型时，必须显式进行转换，以避免数据丢失。例如，double转为int时需要使用 (int) 进行强制转换。



`int a=4`
`char c='0';`
`int b=a+c;`

请回答这个过程涉及到的是自动类型转换还是强制类型转换，b的值是多少，为什么会是这个值

**答**:涉及到**自动类型转换**。这里的 char 类型的 c 被自动转换为对应的整数值。在Java中，字符类型char实际上是一个16位的无符号整数，代表字符的Unicode值(每个字符的唯一的二进制编码)。



### 包装类

包装类用于将基本数据类型转换为对象，以便在需要对象的场合使用。每种基本数据类型都有对应的包装类：

1. byte - Byte

2. short - Short

3. int - Integer

4. long - Long

5. float - Float

6. double - Double

7. char - Character

8. boolean - Boolean

   **基本数据类型缓存池**

java会在内存中缓存对象实例，以提高性能和减少内存消耗。

e.g.

Integer 缓存：Integer 类型在 -128 到 127 之间的值会被缓存。例如，Integer a = 100; 和 Integer b = 100; 会引用同一个对象。

其他类型：Byte 和 Short 也有类似的缓存机制，Character 缓存范围为 \u0000 到 \u007F(\u代表Unicode编码)。Long 默认不启用缓存，但可以通过手动指定范围实现。

这个机制可以提高比较性能，尤其是在使用 == 比较时。

1.`Integer x = new Integer(18);`
`Integer y = new Integer(18);`
`System.out.println(x == y);`

2.`Integer z = Integer.valueOf(18);`
`Integer k = Integer.valueOf(18);`
`System.out.println(z == k);`

3.`Integer m = Integer.valueOf(300);`
`Integer p = Integer.valueOf(300);`
`System.out.println(m == p);`

包装类将该数据类型

1.创建了两个不同的对象x,y,地址值不同,故返回false

2.Integer.valueOf利用了缓存机制,在int可存储范围的对象每次会返回同一个缓存值,即x,y指向的内存区域相同,即地址值相同,故返回true

3.300超出Integer的最大可缓存空间,依旧会创建两个不同对象,故返回false
