package Functionalinterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10000);
        list.add(50000);
        list.add(20000);
        list.add(25000);
        list.add(35000);

        Predicate<Integer>p=sal->sal>30000;
        Consumer<Integer>c=sal->System.out.println("salary is :"+sal);
        Function<Integer,Integer>f=sal->sal*12;
        Supplier<Integer>s=()->10000;

        // for(Integer emp:list){
        //     if(p.test(emp)){
        //        c.accept(emp);
        //        System.out.println("Annual salary is :"+f.apply(emp));
        //     }
        // }

        // System.out.println(
        //         "Default salary: " + s.get()
        // );

        
        list.stream().filter(emp->p.test(emp)).forEach(c::accept);
        // salary is :50000
        // salary is :50000

        list.stream().map(emp->f.apply(emp)).forEach(c::accept);
        // salary is :120000
        // salary is :600000
        // salary is :240000
        // salary is :300000
        // salary is :420000
    }
}
