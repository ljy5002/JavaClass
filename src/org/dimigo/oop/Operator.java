public class Operator {
    public static void main(String[] args) {
        //1.산술
        int a=5,b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //2.5 만들기
        System.out.println((float)a/b);
        //0으로 나눠 보기
//        System.out.println(a/0);
        //다른 타입 간의 연산
        int i=10;
        double d=3.14;
        int r = (int)(i+d);
        double r2 = i + d;
        short s1 = 1, s2 = 2;
        short r3 = (short)(s1+s2);

        //3. shortCit
        boolean flag   = true;
        a=10;
        b=0;
        if(flag || (a/b==0)) {
            System.out.println("or연산");
            if (flag || (a / b == 0));
        }
    //문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 3;
        String name = "나자바";
        System.out.println(school + grade + ban+ name);
        System.out.println(grade + ban + school + name);
        System.out.println(""+grade+ban+school+name);
    }
}
