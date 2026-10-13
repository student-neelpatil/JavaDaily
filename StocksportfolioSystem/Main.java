package StocksportfolioSystem;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

/**
 * Main
 */
public class Main {

  

  public static void main(String[] args) {
    ArrayList<Stock> stocks = new ArrayList<>();
     Stock s=new Stock();

    Scanner sc = new Scanner(System.in);
    boolean running = true;

    int choice = sc.nextInt();

    do {
      System.out.println("------------Menu-----------------");
      System.out.println("1.Add a stock");
      System.out.println("2.Search by sector");
      System.out.println("3.highest market value");
      System.out.println("4.display all stock record in descending order");
      System.out.println("5.save to file");
      System.out.println("6.load from file");
      System.out.println("7.display all stocks");
      System.out.println("8.exit");

           String input;
           Sector sec ;
           int quantity;
           double marketprice;

      switch (choice) {
        case 1:
          int id=sc.nextInt();
          String symbol=sc.nextLine();
          String companyname=sc.nextLine();
          quantity=sc.nextInt();
          double purchase=sc.nextDouble();
           marketprice=sc.nextDouble();

         

           sec = Sector.valueOf(sc.nextLine());
          Stock newobj=new Stock(id,symbol,companyname,sec,quantity,purchase,marketprice);

          stocks.add(newobj);
          System.out.println("stock has been added to the portfolio");
          
            
          break;

        case 2:
          input=sc.nextLine();
          sec = Sector.valueOf(input);
           Predicate<Stock>p=(Stock)->Stock.sec()==sec;
           stocks.stream().filter(p).forEach(System.out::println);//we can also use predicate 
         //or filter((Stock)->Stock.sec()==sec)
          break;

        case 3:
         //Function<Stock,double>f=(e)->e.marketPrice()*e.quantity();
        //  stocks.stream().map(e->e.marketPrice()*e.quantity()).max(s.marketPrice()*s.quantity()::compareTo);
         
        stocks.sort(Comparator.comparingDouble((e)->e.marketPrice()*e.quantity()));
         System.out.println(stocks.get(0));
          break;

        case 4:
          stocks.stream().sorted();


          break;

        case 5:

          break;

        case 6:

          break;

        case 7:

          break;

        case 8:

          break;

        default:
          break;
      }

    } while (running);

    sc.close();

  }

  private static Comparator<? super Stock> Comparator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Comparator'");
  }
  

}
