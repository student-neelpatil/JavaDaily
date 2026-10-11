package foodmenu;

public class Bill {
    String name;
    int price;
    int quantity;

    public Bill(String name,int price ){
        this.name=name;
        this.price=price;
        this.quantity=0;
    }

    public String getName(){
        return name;
    }

    public int getprice(){
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }


}


// enum FoodMenu {

//     DOSA(100),
//     SAMOSA(20),
//     IDLI(40),
//     MEDUWADA(50),
//     PAVBHAJI(80),
//     NOODLES(60),
//     CHOLE_BHATURE(90),
//     BURGER(120),
//     PIZZA(250);
    

//     private int price;

//     FoodMenu(int price) {
//         this.price = price;
//     }

//     public int getPrice() {
//         return price;
//     }
// }