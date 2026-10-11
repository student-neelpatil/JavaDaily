package datemenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Program {

    public static void addDays(ArrayList<LocalDate>dlist,int days,int index){
         dlist.get(index).plusDays(days);
    }

   public static void addMonths(ArrayList<LocalDate> dlist,int Months,int index){
        dlist.get(index).plusMonths(Months);
    }

    public static void addYears(ArrayList<LocalDate> dlist,int years,int index){
        dlist.get(index).plusYears(years);
    }

    

    public static void display( ArrayList<LocalDate>dlist){

        for(int i=0;i<dlist.size();i++){
               System.out.println(dlist.get(i));   
        }
    }
    
    public static void main(String[] args) {
        boolean exitprogram=true;

           ArrayList<LocalDate>datelist=new ArrayList<>();
           
        
           datelist.add(LocalDate.of(2026,10,9));
           datelist.add(LocalDate.of(2025,9,9));
           datelist.add(LocalDate.of(2024,11,1));


        do{
            System.out.println("--------Menu----------");
            System.out.println("1.Set Date");
            System.out.println("2.Add days");
            System.out.println("3.Add Months");
            System.out.println("4.Add years");
            System.out.println("5.display");
            System.out.println("6.exit");
            System.out.println("---------------------------");

            int choice;
            choice=ConsoleInput.getInt();
            
            // LocalDate date=ConsoleInput.getdate();

            switch (choice) {
                case 1:
                   LocalDate date=ConsoleInput.getdate(); 
                   datelist.add(date);
                   System.out.println("new date is:" + date);
                    
                    break;

                case 2:
                    System.out.println("enter days");
                    int days=ConsoleInput.getInt();
                    System.out.println("enter index");
                    int index1=ConsoleInput.getInt();
                    addDays(datelist, days,index1);
                    break;

                case 3:
                    System.out.println("enter months");
                    int months=ConsoleInput.getInt();
                    System.out.println("enter index");
                    int index2=ConsoleInput.getInt();
                    addMonths(datelist, months,index2);
                    break;

                case 4:
                    System.out.println("enter years");
                    int years=ConsoleInput.getInt();
                    System.out.println("enter index");
                    int index3=ConsoleInput.getInt();
                    addYears(datelist, years,index3);

                    break;

                case 5:
                    display(datelist);
                     break; 

                case 6:
                    System.out.println("exit the program");
                    exitprogram=false;
                    break;

                default:
                    System.out.println("Invalid! case not found");
                    break;
            }


        }while(exitprogram);
    }
}
