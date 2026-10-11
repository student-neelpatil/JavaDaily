package streams;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void filterlist(List<Integer>num){
        //   num.stream().filter(n->n>50).forEach(System.out::println);

          Predicate<Integer>isPositive=n->n>0;

           num.stream().filter(isPositive).forEach(System.out::println);

          

    }

     public static void maplist(List<Integer>num){
         num.stream().map(n->n*n).forEach(System.out::println);
     }

     public static void sortedlist(List<Integer>num){
      //use of distinct
        num.stream().sorted(Comparator.naturalOrder()).distinct().forEach(System.out::println);
        System.out.println("----------------------------");

         // Descending order+limit+skip()
        num.stream()
               .sorted(Comparator.reverseOrder()).limit(8).skip(1)
               .forEach(System.out::println);
     }

     public static void reducelist(List<Integer>num){
        System.out.println("addition ");
        int sum=num.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);


        System.out.println("maximum");
        //int max =num.stream().reduce(Integer::compareTo).get();
        int max=num.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(max);

        //count,max,min

        System.out.println(num.stream().max(Integer::compareTo));
        System.out.println(num.stream().min(Integer::compareTo));
        System.out.println(num.stream().count());
      
     }



    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(10,20,30,30,40,50,89,39,67,40,120,340,98);

        //Without streams
        // for(Integer num:numbers){
        //    if(num%2==0){ 
        //     System.out.println(num);
        //    }
        // }

        //with streams
        //1 way to represent it
        // numbers.stream()
        //                .filter(num->num%2==0)
        //                .toList()
        //                .forEach(System.out::println);
        //2nd way
        
        // Stream<Integer>stream=numbers.stream();

        // stream.filter(num->num%2==0).forEach(System.out::println);


        //forEach consumes stream so dont write anything after forEach

        //creating stream without list

        // Stream<Integer>stream=Stream.of(10,20,30);
        // stream.forEach(System.out::println);


        //from an array

        // int []arr={110,120,130};

        // Arrays.stream(arr).forEach(System.out::println);
   
        filterlist(numbers);
        maplist(numbers);

    System.out.println("--------------------");
    sortedlist(numbers);

    System.out.println("--------------------");
    reducelist(numbers);
        
    }
}
