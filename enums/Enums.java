package enums;

public class Enums {
    public static void main(String[] args) {
        //for local defined enum public is not used
         
        Workdays d=new Workdays();
        d.setday(days.FRIDAY);
        d.setday(days.MONDAY);
        // d.day=days.MONDAY;
      //creating object like varaible 

       days d2=days.FRIDAY;//this d2.getmessage always gives message for friday
    //    System.out.println(d2.getMessage()); //today is friday

       switch (d.getDay()) {
        case MONDAY:
            System.out.println(d.getDay().getMessage());
            break;
        case TUESDAY:
           System.out.println(d.getDay().getMessage());
            break;
        case WEDNESDAY:
            System.out.println(d.getDay().getMessage());
            break;    
       
        case THURSDAY:
            System.out.println(d.getDay().getMessage());
            break;   
        case FRIDAY:
           System.out.println(d.getDay().getMessage());
             
            break;  
         case SATURDAY:
            System.out.println(d.getDay().getMessage());
             
            break; 
        case SUNDAY:
           System.out.println(d.getDay().getMessage());
             
            break;                 
        default:
            break;
       }
        
        
    }
    
}

class Workdays{
    days day;

    public void setday(days day){
           this.day=day;
    }

    public days getDay(){
        return this.day;
    }
}
 //here we created a enum
 //The public type days must be defined in its own file
 enum days{
            

              MONDAY("todays is monday"),
              TUESDAY("todays is tuesday"),
              WEDNESDAY("todays is wednesday"),
              THURSDAY("todays is thursday"),
              FRIDAY("todays is friday"),
              SATURDAY("todays is Saturday"),
              SUNDAY("todays is sunday");

              private String message;

              days(String message){
                this.message=message;
              }



              public String getMessage(){
                return this.message;
              }
        }
