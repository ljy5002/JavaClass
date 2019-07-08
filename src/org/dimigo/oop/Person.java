package org.dimigo.oop;

public class Person {
    private final String type = "포유류";
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020220","이주엽");
        Person p2 = new Person("20180101","이규현");
        System.out.println(p1);
        System.out.println(p2);


    }


}
