package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        add(intArr,10);
        printArray(intArr);

        String[] strArr = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(strArr, "북");
    }

    private static void changeName(String[] strArr, String name) {
      //1번째 방법
        for(int i=0; i<strArr.length;i++){
            System.out.println(name + strArr[i].substring(1));
        }
    }

    private static void printArray(int[] intArr) {
    for(int value : intArr){
        System.out.print(value + "| ");
    }
        System.out.println();
    }

    private static void add(int[] intArr, int num){
    for (int i=0; i< intArr.length; i++){
        intArr[i] += num;
    }
    }
}
