package org.dimigo.inheritance;

public class Person {
    private static String name;
    public int age;
    private int height;
    private int weight;

    public  Person(String name,int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void eat(){
        System.out.println(name +"가 밥을 먹는다.");
    }

    public void sleep(){
        System.out.println(name +"가 잠을 잔다");
    }

    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
