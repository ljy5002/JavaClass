package org.dimigo.oop.basic;

import org.dimigo.oop.Book;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 배열
        //int, float, double, byte, boolean, short, char, long
        int[] intArr = null;
        intArr = new int[5];
        printArray(intArr);
//double 타입 5개짜리 배열 만들고 출력하기
        double[] doubleArr = null;
        doubleArr = new double[5];
        printArray(doubleArr);
        int [] intArr2 = {1,2,3,4,5};
        int [] intArr3 = new int[] {1,2,3,4,5};
        printArray(intArr2);
        //참조형 배열(모든 참조형 배열의 초기값 null)
        // String. Book. Car. Stringbuilder
        String [] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "중궈";
        strArr[1] = "기제";
        strArr[2] =  "문학";
        printArray(strArr);

        String[] strArr2 ={"정준영", "승리", "로이킴"};//new String[]생략?
        printArray(strArr2);

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("미생", "윤태호", 100);
        bookArr[1] = new Book("자바의 신","나자바", 200);
        printArray(bookArr);//

        Book[] bookArr2 ={
                new Book("미생","윤태호", 100),
                new Book("자바의 신","나자바", 200)
        };
        //배열 사용시 주의 사항
        int [] intArr4 = null;
        System.out.println(intArr4.length);
        intArr4 = new int[3];
        System.out.println(intArr4.length);
        //System.out.println(intArr4[3]); = 범위를 벗어난다.
        System.out.println(intArr4[intArr4.length-1]);

        String[] strArr3 = new String[3];
        //System.out.println(strArr3[0].length());null로 초기화 되어 있으면 nullpointxception

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0].getTitle());//nullpointexception

        String[] arr =  null;
        arr =new String[]{"이주엽", "이우진"};
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr){
            System.out.println(value);
        }//toString은 내부적으로 중요한 메소드, toString이 있을 경우 참조해서 사용
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value+"|");
        }
    }

    private static void printArray(double[] doubleArr) {
    for(double value : doubleArr){
        System.out.println(value +"|");
        }
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.print(value + "|");
        }
    }
}
