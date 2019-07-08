package org.dimigo.oop;

public class StringClass {
    public static void main(String[] args) {
        //문자열 리터럴 방식
        String cat1 = "묘묘묘묘묘묘";
        String cat2 = "묘묘묘묘묘묘";
        System.out.println(cat1 == cat2);

        //2. new 객체 생성 방식
        String dog1 = new String("강아지");
        String dog2 = new String("강아지");
        System.out.println(dog1 == dog2);

        //문제
        System.out.println(cat1=="묘묘묘묘묘묘");
        System.out.println(dog1 == "강아지");

        //equals () 문자열 비교, 메모리 영역 생각 안하고 문자열만 비교하고 싶을 때

        System.out.println(dog1.equals(dog2));
        System.out.println(cat1.equals(cat2));

        String id = "admin";
        //id가 admin이면 관리자 출력
        //아니면 "일반 사용자" 출력
        if(id == null){
            System.out.println("입력하세요");
        }
        if(id.equalsIgnoreCase("admin")){//id와 admin의 위치를 바꾸어주면 null 오류는 뜨지는 않고, 일반사용자 처리한다.
            System.out.println("어드민입니다");
        }
        else{
            System.out.println("일반사용자입니다.");
        }
        testString();
    }
//문자열 길이
    private static void testString() {
        String s= "ABCDEFGabcdefg";
        System.out.println(s.length());
        //문자열 일부 추출
        System.out.println(s.substring(3, 6));// x번째 자리부터 x번째 자리까지 중요!
        System.out.println(s.indexOf("c"));// 문자의 자리수
        System.out.println(s.charAt(7));// x번쨰 자리에 있는 문자
        System.out.println(s.concat("ABC"));//뒤에 문자열 붙여주는 명령어
        System.out.println(s.trim());// 띄어쓰기 없애는 명령(얖옆에만)
        System.out.println(s.toUpperCase());// 대문자로 전부 바꿔주는 명령
        System.out.println((s.toLowerCase()));//소문자로 전부 바꿔주는 명령
        System.out.println(s.replace('a','A'));
        System.out.println(s.startsWith("abc"));//~~~로 시작하는 가를 묻는 명령어 boolean타입
        System.out.println(s.endsWith("EFG"));//~~~로 끝나는 가를 묻는 명령어 boolean타입
    }
}
