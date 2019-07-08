package org.dimigo.Abstractclass;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(new Benz());
        car.start();
        car.stop();
        System.out.println("======엔진 교체======");
        car.setEngine(new BMW());
        car.start();
        car.stop();
    }

}
