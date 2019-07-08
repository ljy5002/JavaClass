package org.dimigo.interfaces;

import org.dimigo.Abstractclass.BMW;
import org.dimigo.Abstractclass.Benz;
import org.dimigo.Abstractclass.Car;

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
