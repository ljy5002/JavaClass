package org.dimigo.oop;

public class CalCulator2 {
    private boolean powerFlag;

    public void powerOn() {
        if(powerFlag == false) { //!powerflag와 같다
            System.out.println("전원을 켭니다.");
            powerFlag = true;
        }
    }
    public void powerOff() {
        if(powerFlag == true) {
            System.out.println("전원을 끕니다.");
            this.powerFlag = false;
        };
    }
    public static int add(int num1, int num2, CalCulator2 c){ return num1 + num2; }
    public static int sub(int num1, int num2, CalCulator2 c){
        return num1 - num2;
    }
    public static int mul(int num1 ,int num2, CalCulator2 c){
        return num1 * num2;
    }
    public static double div(int num1, int num2, CalCulator2 c){
        return num1 / num2;
    }
}

