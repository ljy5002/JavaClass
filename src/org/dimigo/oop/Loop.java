import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //1.for 문
        //구구단 출력하기
        for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.printf("%d * %d = %d, ",i,j,i*j);
            }
            System.out.println();
        }
        //2.FOR each문
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //확장 for문
        for(int value : arr){
            System.out.println(value);
        }
        //좋아하는 그룹 출력
        //~~~~~~~~~
        //3.while, do-whlie
        //메뉴 처리
        Scanner scanner = new Scanner(System.in);
        int menu=0;
        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1.BTS");
            System.out.println("2.레드벨벳");
            System.out.println("3.여자친구");
            System.out.println("9.종료");
            System.out.printf("메뉴 입력 => ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("bts");
                    break;
                case 2:
                    System.out.println("레드벨벳");
                    break;
                case 3:
                    System.out.println("여자친구");
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    break;

                default:
                    System.out.println("이상한 메뉴입니다.");


            }
        }
        while(menu != 9);
        scanner.close();
    }
}
