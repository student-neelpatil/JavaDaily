package practice2;

//constructor chaianing
public class Program {
    
  public static void main(String[] args) {
    
    Practice p=new Practice();
    System.out.println(p);
    System.out.println(p.rollno);
    System.out.println(p.name);

  }

}

class Practice{
    int rollno;
    String name;

    Practice(){
        this (10);
        System.out.println("This is first chain of constructor");

    }
    Practice(int rollno){
        this(rollno,"Neel");
        System.out.println("This is second chain of constructor");
    }

    Practice(int rollno,String name){
        System.out.println("This is third constructor");
        this.rollno=rollno;
        this.name=name;
    }
}
