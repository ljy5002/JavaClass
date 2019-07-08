package org.dimigo.basic;

public class PrimitiveDataType {
    static boolean flag;
    public static void main(String[] args) {
        /*
        //1. 논리형(전역변수일 경우 default값으로 설정, static이 main앞에 있을 경우 전역변수에 static 붙일 것)
        //System.out.println(flag ? "참입니다" : "거짓입니다");3항 연산자 사용
        if(flag){
            System.out.println("참입니다");
        }
        else{
            System.out.println("거짓입니다");
        }
        */
        /*
        // 2. 문자형
        char ch1 = 'A';
        char ch2 = 65;
        char ch3 = '\u0041';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        */
        /*
        // 3.문자열
        String name= "이주엽";
        System.out.println("MY name is "+name);
        */
        /*
        //3.정수형
        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0A;
        System.out.printf("%d, %d. %d, %d",i1,i2,i3,i4);
        */
        /*
        // byte 타입(-128~127,뱅글뱅글 돔 = -128에서 1감소시키면 127)
        byte b1 = -128;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);
        */
        /*
        //정수의 범위 출력
        System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        */
        //실수형
        float f1=3.14f;
        double dl=3.14;
        //높은 정밀도 : double

    }
}
