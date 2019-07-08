package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("동물");
        System.out.println(a);
        a.bark();

        Dog d = new Dog("댕댕이");
        System.out.println(d);
        d.bark();
        d.catchBall();

        Cat c = new Cat("고양이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t = new Tiger("호랑");
        System.out.println(t);
        t.bark();
        t.hunt();

        Animal a2 = new Dog("멍멍이");
        Animal a3 = new Cat("냐옹쓰");
        Animal a4 = new Tiger("호랑쓰");
        a2.bark();
        a3.bark();
        a4.bark();
        Animal[] animals ={
                new Dog ("강아지"),
                new Cat ("냥이"),
                new Tiger("랑이")
        };
        for(Animal animal : animals){
            doBark(animal);
        }
        Animal b = new Dog("멍멍");
        Animal b2 = new Cat("야옹이");
        Animal b3 = new Tiger("호돌이");

        b.eat();
        b.sleep();
        b.bark();
        //b.catchBall();
        Dog dog = (Dog)b;
        dog.catchBall();
        ((Dog) b).catchBall();//타입 캐스팅

        ((Cat) b2).scratch();

        Animal c1 = new Dog("멍멍이");
        Animal c2 = new Cat("야옹이");
        System.out.println(c1 instanceof Dog);//true
        System.out.println(c2 instanceof Cat);//true
        System.out.println(c1 instanceof  Cat);//f
        System.out.println(c2 instanceof Dog);//f
        System.out.println( c1 instanceof Animal);//t
        System.out.println(c2 instanceof Object);//t
    doBark(c1);
    doBark(c2);
    }

    private static void doBark(Animal animal){
       if(animal instanceof Dog) {
           Dog dog= (Dog) animal;
           dog.catchBall();
       }else if (animal instanceof Cat){
           ((Cat) animal).scratch();
       }
    }
}
