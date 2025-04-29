import java.util.Scanner;

//sc = scanner / choose = 사용자가 선택한 주문 / total=사용자가 선택한 음식 총합 가격/

public class Main {
    public static void main(String[] args) {
        //클래스 호출
        Kiosk kio = new Kiosk(MenuItem.menuList);

        //변수 선언
        String more;


        System.out.println("메뉴");
        for (MenuItem food : MenuItem.menuList)
            System.out.printf("%d) %s | %d | %s\n",food.mnum,food.mname,food.mprice,food.mintro);
        System.out.println("0) 종료");

        kio.start();

    }
}
