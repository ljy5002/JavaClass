package org.dimigo.oop;

import java.util.Arrays;

public class WrapperTest {
    public static void main(String[] args) {
        //wrapper 클래스 : 기본 자료형을 객체화시켜주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(10));//10을 2진수로 바꾸어줌
        System.out.println(Integer.toHexString(13));

        //boxing: 기본 자료형 데이터 -> WRAPPER 클라스 객체
        //생성자 이용
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1.equals(i2));
        //valueof 이용
        Integer.valueOf(100);

        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");

        //UNboxing
        int i= i3.intValue();
        //문자열 -> 기본형 parse:XXX()
        int i5 = Integer.parseInt("200");
        //3.14 -> double
        double d2 = Double.parseDouble("3.14");

        System.out.println(Arrays.toString(args));

        int a=Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);

        Integer n1 = new Integer(1000);
        Integer n2 = new Integer(2000);
        System.out.println(n1 + n2);

        //몇번의 autounboxing과 autoboxing이 일어나는가?(시험?)
        Integer n3 = 10;//autoboxing 1번
        Integer n4 = n3 + 20;//autounboxing 1번, autoboxing 1번
        Integer result = n3+n4;// autounboxing 2번, autoboxing 1번


    }
}
