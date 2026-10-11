package practice1;



public class Program {
   public static void main(String[]args){

    boolean exitprogram=true;
       
    System.out.println("Enter the first num");
    int num1=ConsoleInput.getInt();

     System.out.println("Enter the second num");
     int num2=ConsoleInput.getInt();


     Calculator calculator=new Calculator(num1,num2);

     do{
          System.out.println("\n-------- MENU --------");
            System.out.println("1. add");
            System.out.println("2. substract");
            System.out.println("3. multiply ");
            System.out.println("4. divide");
            System.out.println("5. exit");
          
           System.out.println("Pls select one option");
           int choice=ConsoleInput.getInt(); 

         switch(choice){
            case 1:
                System.out.println(calculator.getadd());
               
                break;
            case 2:
                 System.out.println(calculator.getsub());
                break;
            case 3:
                 System.out.println(calculator.getmul());
                break;
            case 4:
                 System.out.println(calculator.getdivide());
                break;
            case 5:
                System.out.println("exit the program");
                exitprogram=false;
                break;    
            default: 
                System.out.println("invalid program");               
         }

        
     }while(exitprogram);
    
   } 

}
