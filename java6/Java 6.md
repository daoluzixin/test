# Java 6

## 继承

一个类（子类）从另一个类（父类）派生出新的类，从而复用已有的代码。子类可以继承父类的属性和方法，也可以扩展或重写它们，以实现更具体的功能。

## 多态

不同类的对象可以通过同一接口进行操作，具体的执行行为在运行时确定。

### 实现途径

1. **方法重载**(方法名相同但参数类型或数量不同)

`public class MathUtils {`
    `public int add(int a, int b) {`
        `return a + b;`
    `}`

    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
`}`

2. **方法重写** (子类中定义一个与父类方法相同的方法（名称、返回类型、参数列表相同）。在运行时，调用的方法由对象的实际类型决定，而不是变量的类型)

`public class Animal {`
    `public void makeSound() {`
        `System.out.println("Animal sound");`
    `}`
`}`

`public class Dog extends Animal {`
    `@Override`
    `public void makeSound() {`
        `System.out.println("Bark");`
    `}`
`}`

`public class Cat extends Animal {`
    `@Override`
    `public void makeSound() {`
        `System.out.println("Meow");`
    `}`
`}`

`public class Main {`
    `public static void main(String[] args) {`
        `Animal myDog = new Dog();`
        `Animal myCat = new Cat();`

        myDog.makeSound(); // 输出 "Bark"
        myCat.makeSound(); // 输出 "Meow"
    }
`}`