import java.util.Scanner;
//sc = scanner / choose = 사용자가 선택한 주문 / total=사용자가 선택한 음식 총합 가격 / more=추가주문 여부

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        int choose=0;
        int total=0;
        String more;

        //사용자 시점 인터페이스
        System.out.println("Menu");
        System.out.println("주메뉴");
        System.out.println("1) 구운 치킨 / 14,000w / 노릇하게 구운 치킨");
        System.out.println("2) 튀긴 치킨 / 14,000w / 바삭하게 튀긴 치킨");
        System.out.println("사이드");
        System.out.println("3) 구운 감자 / 3,000w / 노릇하게 구운 감자");
        System.out.println("4) 감자튀김 / 3,000w / 바삭하게 튀긴 감자");
        System.out.println("5) 음료 / 2,000w / 시원한 탄산 음료수");
        System.out.println("6) 종료");
        System.out.println();

        //사용자가 선택한 음식의 종류에 따른 계산 반복
         do {
             System.out.println("지불하실 금액: " + total + "원");
             System.out.println("주문하시고자 하는 메뉴의 번호를 입력해주세요: ");
             choose = sc.nextInt();
             if (choose == 1) {
                 total += 14000;
             }
             else if (choose == 2) {
                 total += 14000;
             }
             else if (choose == 3) {
                 total += 3000;
             }
             else if (choose == 4) {
                 total += 3000;
             }
             else if (choose == 5) {
                 total += 2000;

             }
             else if (choose == 6){
                 System.out.println("주문을 종료하겠습니다");
                 System.out.println("총 지불 금액:"+total+"원");
             }
             else {
                 System.out.println("다시 입력해주세요");
             }
         } while(choose!=6);
































    }
}