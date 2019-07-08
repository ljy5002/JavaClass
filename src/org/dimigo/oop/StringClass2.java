package org.dimigo.oop;

public class StringClass2 {
    public static void main(String[] args) {
        //1. String 으로 문자열 생성
        String s = "디미고";
         s += "2학년";
         s+="3반";
         s+="이주엽";
         //2. StringBuilder로 문자열 생성
        StringBuilder sb= new StringBuilder("디미고");
        sb.append("디미고");//append 오버로딩
    sb.append("2학년 ").append("3반").append("이주엽");
        System.out.println(sb.toString());//toString 추가는 필수

        CompareSpeed();
    }

    private static void CompareSpeed() {
    //String, StringBuffer, StringBuilder StringBuilder>StringBuffer>String
        long Start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);
        for(int i=0;i<100000;i++){
            sb.append("def");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - Start);
    }
}
