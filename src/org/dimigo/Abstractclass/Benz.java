package org.dimigo.Abstractclass;

public class Benz extends Engine {
    @Override
    public void startEngine() {
        System.out.println(" BenzEngine 엔진 기동");
    }

    @Override
    public void stopEngine() {
        System.out.println("BenzEngine 엔진 멈춤");
    }
}
