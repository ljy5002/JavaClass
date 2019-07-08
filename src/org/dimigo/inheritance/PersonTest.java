package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이린", 28, 158, 48);
        System.out.println(p.toString());
        p.eat();
        p.sleep();

        Student s = new Student("슬기", 25, 165,50,"2329");
        System.out.println(s.toString());
        s.study();
        s.eatSnack();

        Teacher t = new Teacher("루시드", 29,180,70, "과학");
        System.out.println(s.toString());
        t.oversee();
        t.teach();
    }
}
