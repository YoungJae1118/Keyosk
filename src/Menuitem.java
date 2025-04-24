public class Menuitem {
        //속성 mnam=메뉴 이름, munm=메뉴 번호,mprice=메뉴 가격,mintro=메뉴 설명
        String mname,mintro;
        int mnum,mprice;


        public Menuitem(int num,String name,int price,String intro){
                this.mnum = num;
                this.mintro=intro;
                this.mname=name;
                this.mprice=price;
        }



        //기능
        public void printMenu() {
                System.out.println("Menu");
                System.out.println(mnum + ")" + mname + "|" + mprice + "|" + mintro);
                System.out.println("6) 종료");
                System.out.println();
        }
}

