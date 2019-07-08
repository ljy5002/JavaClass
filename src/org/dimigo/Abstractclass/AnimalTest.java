package org.dimigo.Abstractclass;

public class AnimalTest {
    public static void main(String[] args) {
       Animal[] animals = {new Dog(),new Cow(), new Duck()};
       for (Animal animal : animals){
           animal.eat();
       }
        System.out.println("======늑대가 나타났다=====");
       for(Animal animal : animals){
           animal.bark();
       }
    }
}
