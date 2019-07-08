import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        //if 문
        //선거권 연령 : 만 19세
        int age = 17;
        if(age >= 19){
            System.out.println("투표하러 갑시다");
        }
        else{
            System.out.println("투표권이 없네요");
        }
        //switch문
        //주사위 랜덤 뽑기(1~6)
        int num = new Random().nextInt(6) + 1;
        switch(num%2){
            case 0:
                System.out.println("짝수입니다");
                break;
            case 1:
                System.out.println("홀수입니다");
                break;
            default:
                System.out.println("이상한 수입니다.");
        }
        String menu = "짜장면";
        switch(menu){
            case "짜장면   ":
                System.out.println("짜장면 선택");
                break;
            case"짬뽕":
                System.out.println("짬뽕 선택");
                break;
                default:
                    System.out.println("다이어트 하십니까..?");
        }
    }
}
