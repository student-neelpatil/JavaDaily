package foodmenu;

import java.util.ArrayList;

public class Program {

    public static void generateBill(ArrayList<Bill>bill){
          int grandtotal=0;
                System.out.println("final bill");

                System.out.printf("%s %s %s %s%n","Item","Price","Qty","Amount");

                for(Bill b:bill){
                    if(b.getQuantity()>0){
                        System.out.printf("%s %d,%d %d%n", b.getName(),
                    b.getprice(),
                    b.getQuantity(),
                    b.getTotalPrice()
                    );
                    grandtotal +=b.getTotalPrice();
                    }
                    
                }
                System.out.println("bill generated is :"+ grandtotal);
              
    }
   public static void main(String[]args){

    boolean exitprogram=true;

    ArrayList<Bill>bill=new ArrayList<>();
    
    //  Bill[] menu = {
    //         new Bill("Dosa", 50),
    //         new Bill("Samosa", 20),
    //         new Bill("Idli", 30),
    //         new Bill("Meduwada", 25),
    //         new Bill("Pav Bhaji", 80),
    //         new Bill("Noddles", 150),
    //         new Bill("Chole bhature", 100),
    //         new Bill("Burger", 60),
    //         new Bill("Pizza", 150)
    //     };
    bill.add(new Bill("Dosa",70));
    bill.add(new Bill("Samosa",30));
    bill.add(new Bill("Idli",50));
    bill.add(new Bill("Meduwada",60));
    bill.add(new Bill("Pav bhaji",80));
    bill.add(new Bill("Noodles",90));
    bill.add(new Bill("Chole Bhature",90));
    bill.add(new Bill("Burger",50));
    bill.add(new Bill("Pizza",150));
       
     do{
           System.out.println("\n-------- MENU --------");
            System.out.println("1. Dosa");
            System.out.println("2. Samosa");
            System.out.println("3. Idli ");
            System.out.println("4. Medu wada");
            System.out.println("5. Pav bhaji");
            System.out.println("6. Noodles");
            System.out.println("7. Chole bhature");
            System.out.println("8. Burger");
            System.out.println("9. Pizza");
            System.out.println("10. Generate bill");
            System.out.println("11. exit");
          
           System.out.println("Pls select one option");
           int choice=ConsoleInput.getInt(); 

           int quantity;

         switch(choice){
            case 1:
                System.out.println("enter quantity for dosa");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[0].addQuantity(quantity);
                    bill.get(0).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                break;
            case 2:
                 System.out.println("enter quantity for samosa");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[1].addQuantity(quantity);
                      bill.get(1).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                 
                break;
            case 3:
                System.out.println("enter quantity for idli");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[2].addQuantity(quantity);
                      bill.get(2).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                break;
            case 4:
                  System.out.println("enter quantity for meduwada");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[3].addQuantity(quantity);
                      bill.get(3).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                break;
            case 5:
                 System.out.println("enter quantity for pavbhaji");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[4].addQuantity(quantity);
                      bill.get(4).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                break;
            case 6:
                 System.out.println("enter quantity for Noodles");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[5].addQuantity(quantity);
                      bill.get(5).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                 break;
            case 7:
                 System.out.println("enter quantity for Chole bhature");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[6].addQuantity(quantity);
                      bill.get(6).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                 break;
            case 8:
                 System.out.println("enter quantity for burger");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[7].addQuantity(quantity);
                      bill.get(7).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                 break;
            case 9:
                 System.out.println("enter quantity for pizza");
                quantity=ConsoleInput.getInt();
                if(quantity>0){
                    // menu[8].addQuantity(quantity);
                      bill.get(8).addQuantity(quantity);
                }else{
                    System.out.println("plz enter valid quantity");
                }
                 break;
            case 10:
                generateBill(bill);
                   break;   
            case 11:
                System.out.println("exit the program");
                exitprogram=false;
                break;    
            default: 
                System.out.println("invalid program");               
         }

        
     }while(exitprogram);
    
   } 

}
