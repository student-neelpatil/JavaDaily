package practice1;

public class Calculator {
    public int num1;
    public  int num2;

    public Calculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public  int getadd(){
        return num1+num2;
    }

     public int getsub(){
        return num1-num2;
    }
     public int getmul(){
        return num1*num2;
    }
     public  int getdivide(){
        if(num2!=0){
            return num1/num2;
        }
        else{
             return 0;
        } 
      
    }
}
