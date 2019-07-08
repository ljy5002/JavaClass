package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        CalCulator2 c = new CalCulator2();

       // Calculator c = new Calculator(a,b);
        c.powerOn();
        System.out.printf("%d + %d = %d\n", a,b,CalCulator2.add(a,b,c));
        System.out.printf("%d - %d = %d\n", a,b,CalCulator2.sub(a,b,c));
        System.out.printf("%d * %d = %d\n", a,b,CalCulator2.mul(a,b,c));
        System.out.printf("%d / %d = %f\n", a,b,CalCulator2.div(a,b,c));
        //c.powerOff();
    }
}
