package org.dimigo.Abstractclass;

public class BMW extends Engine {
    @Override
    public void startEngine() {
        System.out.println(" BMWEngine 엔진 기동");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMWEngine 엔진 멈춤");
    }
}
