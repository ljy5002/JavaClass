public class TypeCasting {
    public static void main(String[] args) {
        // 1. 자동 형변환(프로모션):작은 타입 => 큰 타입
        byte b= 10;
        short s = b;//프로모션
        int i = s;
        long l = i;
        System.out.printf("%d, %d, %d, %d\n", b, s, i, l);
        //2.강제 형변환(casting)
        i=(int)1;
        s=(short)i;
        b=(byte)s;
        //강제 형변환 시 주의 사항 범위를 넘어설 경우
        int i2=128;
        byte b2= (byte)i2;
        System.out.println(b2);
        long l2=100000000000L;
        int i3 = (int)l2;
        System.out.println(i3);
    }
}
