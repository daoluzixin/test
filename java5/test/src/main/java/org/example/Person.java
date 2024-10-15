package org.example;

public class Person {
        private String name;
        private int age;
        private int sex;
        private static int Count = 0;


        private void eat() {
            System.out.println(name+"正在吃东西");
        }

        private void sleep() {

        }

        private void dadoudou() {

        }

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
        Count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int count(){
            return Count;
    }
}

