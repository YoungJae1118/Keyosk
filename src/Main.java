import java.util.Scanner;
//sc = scanner / choose = 사용자가 선택한 주문 / total=사용자가 선택한 음식 총합 가격/

public class Main {
    public static void main(String[] args) {
        //클래스 호출
        Scanner sc = new Scanner(System.in);


        //변수 선언
        int choose=0;
        int total=0;
        String more;


        System.out.println("메뉴");
        for (MenuItem food : MenuItem.menuList)
            System.out.printf("%d) %s | %d | %s\n",food.mnum,food.mname,food.mprice,food. mintro);
        System.out.println("6) 종료");

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





//


    }
}