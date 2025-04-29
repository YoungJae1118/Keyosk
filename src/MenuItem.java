import java.util.List;
import java.util.ArrayList;

public class MenuItem {

String mname,mintro;
int mnum,mprice;

public MenuItem(int mnum,String mname,int mprice,String mintro){
        this.mnum=mnum;
        this.mname=mname;
        this.mprice=mprice;
        this.mintro=mintro;

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
