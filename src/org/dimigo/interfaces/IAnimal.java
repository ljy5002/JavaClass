package org.dimigo.interfaces;

public interface IAnimal {
    //인터 페이스의 필드 -> 상수로 인식(public static final)
    String FARM_NAME="디미 동물농장";

    //추상 메소드(public abstract이 붙음)
//    public abstract void eat();
//    abstract void sleep();
    void bark();

    static void welcome(){
        System.out.println(FARM_NAME + "에 오신 것을 환영합니다.");
    }
    public default void eat() {
        System.out.println("냠냠");
    }

    default void sleep() {
        System.out.println("쿨쿨");
    }



}
