package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        //int 타입 2차원 배열
        int [][] intArr = new int[2][3];
        printArray(intArr);
        intArr[0][1] = 100;
        intArr[1][2] = 90;

        //String 타입 이차원 배열

        String[][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];
        
        strArr[0][0] = "C";
        strArr[0][1] = "C++";
        strArr[0][2] = "JAVA";
        strArr[1][0] = "C#";
        strArr[1][1] =  "python";
        printArray(strArr);

        String[][] strArr2 = {
                {"C","c++","JAVA"},
                {"c#","python"}
        };
    }

    private static void printArray(String[][] strArr) {
        for (String[] arr : strArr) {
            for (String value : arr) {
                System.out.print(value + "|");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] intArr){

        for(int i=0;i<intArr.length;i++){
            for(int j =0 ;j<intArr[i].length; j++){
                System.out.printf(intArr[i][j] + "|");
            }
            System.out.println();
        }

        for(int[] arr : intArr){
            for(int value : arr){
                System.out.print(value +"|");
            }
            System.out.println();
        }
    }
}
