package datemenu;

import java.time.LocalDate;

public class Datetype {
   private LocalDate date;
   private int months;
   private int days;
    private int years;

    public Datetype(){};

    public int getDays(){
         return this.days;
    }

     public int getMonths(){
         return this.months;
    }

     public int getYears(){
         return this.years;
    }
     public LocalDate getDate(){
        return this.date;
     }

    
    
}
