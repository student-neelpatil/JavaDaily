package Strings;

public class Demo1 {
    public static void main(String[] args) {
        //String s="hello";
        // s.concat("world");
        //System.out.println(s);

        //create using string literal
        String s1="Neel";
        String s2="Neel";

        //create using new operator

        String s3=new String("om");
        String s4=new String("om");


        System.out.println("using string literal");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println("using new operator");
         System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}


//output is :

// using string literal
// true
// true
// using new operator
// false
// true

