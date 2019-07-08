package org.dimigo.inheritance2;

public class PersonTest2 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };
        for (Person person : people) {
            System.out.println(person);
            greeting(person);
            System.out.println();
        }
    }
    private static void greeting(Person person){
        person.toString();
        person.sayHello();
        person.sayBye();
    }
}
