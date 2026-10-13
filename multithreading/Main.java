package multithreading;

//2nd method of creating thread
public class Main {
    public static void main(String[] args) {

        Runnable task1=new Runnable(){
        @Override 
       public void run(){
            for(int i=0;i<5;i++){
                System.out.println(i);
            } 
    }

    };

    Runnable task2 = () -> {

        try{
        for(int i=10;i<20;i++){
             System.out.println("Task is running:"+i);
        }
        Thread.sleep(2000);
    }catch(InterruptedException e){
        e.getMessage();
    }
   
};


    Thread t1 = new Thread(task1);
    
    t1.start();

    Thread t2=new Thread(task2);
    t2.start();
        
     System.out.println( Thread.currentThread().getName());
    }

    
}
