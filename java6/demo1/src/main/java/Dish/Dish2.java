package Dish;

public class Dish2 extends dish implements Order{
    private String name;//菜品名称
    private double price;//菜品价格

    public static void profile(){
        System.out.println("回锅肉是普通的大众菜肴，烹调方法比较简单，而且营养搭配合理。色泽鲜艳，口味宜人，深受大众喜爱。其营养价值丰富，具有营养素互补的特点以及健美抗衰老的作用。番茄含有丰富的胡萝卜素、维生素C和B族维生素，番茄红素具有独特的抗氧化能力。鸡蛋含有大量的维生素和矿物质及有高生物价的蛋白质。蛋黄中含有丰富的卵磷脂、固醇类等，对神经系统和身体发育有非常好的作用，深受人们的喜爱。");
    }

    public Dish2(){
        this.name = "回锅肉";
        this.price = 13;
    }

    @Override
    public void cook() {
        System.out.println("回锅肉的烹饪方法为");
    }

    @Override
    public boolean check() {
        boolean random = Math.random() < 0.7;  //小于0.7则返回true
        return random;
    }

    @Override
    public String toString() {
        return "Dish2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
