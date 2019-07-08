package org.dimigo.oop;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("<< 자동차 목록 >>");

        CAR car = new CAR();

        car.setCompany("현대자동차");
        car.setModel("제네시스");
        car.setColor("검정색");
        car.setMaxSpeed(225);
        car.setPrice(50000000);
        System.out.println("제조사명 : "+ car.getCompany());
        System.out.println("모델명 : "+ car.getModel());
        System.out.println("색상 : "+car.getColor());
        System.out.println("최대속도 : "+car.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n",car.getPrice());
        System.out.println();

        CAR car2 = new CAR();

        car.setCompany("기아자동차");
        car.setModel("K7");
        car.setColor("흰색");
        car.setMaxSpeed(246);
        car.setPrice(40000000);
        System.out.println("제조사명 : "+ car.getCompany());
        System.out.println("모델명 : "+ car.getModel());
        System.out.println("색상 : "+car.getColor());
        System.out.println("최대속도 : "+car.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n",car.getPrice());
        System.out.println();
        CAR car3 = new CAR();

        car.setCompany("삼성자동차");
        car.setModel("SM7");
        car.setColor("회색");
        car.setMaxSpeed(200);
        car.setPrice(38000000);
        System.out.println("제조사명 : "+ car.getCompany());
        System.out.println("모델명 : "+ car.getModel());
        System.out.println("색상 : "+car.getColor());
        System.out.println("최대속도 : "+car.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n",car.getPrice());
    }
}
