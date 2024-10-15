package org.example;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p.setAge(12);
        p.setSex(1);
        p.setName("feng");

        System.out.println("Person对象存在的实例个数为: " + p.count());
    }
}