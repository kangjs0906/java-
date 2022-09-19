class Goods {
    String name;
    int price;
    int numberOfStock;
    int sold;

    Goods () {

    }

    void showPrint () {
        System.out.println("상품 이름 : "+name);
        System.out.println("상품 가격 : "+price);
        System.out.println("판매 수량 : "+sold);
        System.out.println("재고 수량 : "+numberOfStock+"\n");
    }

    int countStock () {
        int s;
        s = numberOfStock-sold;
        return s;
    }
}



public class SalesTable {
    public static void main(String[] args) {
        Goods cam1 = new Goods();
        Goods cam2 = new Goods();

        cam1.name="Nikcon";
        cam1.price=400000;
        cam1.sold=30;
        cam1.numberOfStock=50;
        cam1.numberOfStock=cam1.countStock();
        cam1.showPrint();


        cam2.name="Canon";
        cam2.price=430000;
        cam2.sold=41;
        cam2.numberOfStock=75;
        cam2.numberOfStock=cam2.countStock();
        cam2.showPrint();
    }
}
