package MapINterface;

import java.util.HashMap;
import java.util.Map;

public class DemoMap{

    public static void main(String[] args) {
          Map<Integer,String>map=new HashMap<>();

          map.put(101,"Neel");
          map.put(102,"raj");
          map.put(103,"amit");
            
          map.put(102,"rohan");

          map.forEach((key,value)->System.out.println(key + " ->" + value));
    }
   
    

}