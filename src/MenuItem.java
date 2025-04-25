import java.util.List;
import java.util.ArrayList;

public class MenuItem {


        //속성 mnam=메뉴 이름, munm=메뉴 번호,mprice=메뉴 가격,mintro=메뉴 설명
        String mname,mintro;
        int mnum,mprice;


        //생성자
        public MenuItem(int num, String name, int price, String intro) {
                this.mnum = num;
                this.mintro=intro;
                this.mname=name;
                this.mprice=price;
        }


        static List<MenuItem> menuList = new ArrayList<>();

        static {
                menuList.add(new MenuItem(1, "구운 치킨", 14000, "노릇하게 구운 치킨"));
                menuList.add(new MenuItem(2, "튀긴 치킨", 14000, "바삭하게 튀긴 치킨"));
                menuList.add(new MenuItem(3, "구운 감자", 3000, "노릇하게 구운 감자"));
                menuList.add(new MenuItem(4, "튀긴 감자", 3000, "바삭하게 튀긴 감자"));
                menuList.add(new MenuItem(5, "음료", 2000, "시원한 음료"));
        }






}