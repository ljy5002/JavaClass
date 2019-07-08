package org.dimigo.oop;

public class Calculator {
//static이 없는 필드 = 인스턴스 필드 (객체 생성 필수)
    private int num1;
    private int num2;
    private boolean powerflag;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
//인스턴스 메소드 //
    public void powerOn() {
        System.out.println(this);
        if(powerflag == false) { //!powerflag와 같다
            System.out.println("전원을 켭니다.");
            this.powerflag = true;
        }
    }
    public void powerOff() {
        if(powerflag == true) {
            System.out.println("전원을 끕니다.");
            this.powerflag = false;
        };
    }
    public int add(){ return this.num1 + this.num2; }
    public int sub(){
        return this.num1 - this.num2;
    }
    public int mul(){
        return this.num1 * this.num2;
    }
    public double div(){
        return num1 / num2;
    }


    public Calculator() {}

    public static void main(String[] args) {
        //인스턴스 메소드는 같은 필드에 있어도 객체 생성 필수 !!

    }

}
