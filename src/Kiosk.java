import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
int choose;
int total;
    Scanner sc = new Scanner(System.in);

    //필드(=속성)에 리스트가 존재해야 함
    private List<MenuItem> menuItems;


//생성자
    public Kiosk(List<MenuItem> menuItems){
        this.menuItems=menuItems;
    }

    public Kiosk() {

    }


    public void start() {
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
            else if (choose == 0){
                System.out.println("주문을 종료하겠습니다");
                System.out.println("총 지불 금액:"+total+"원");
            }
            else {
                System.out.println("다시 입력해주세요");
            }
        } while(choose!=0);
    }


//










    //메서드










}