// package oops;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.ArrayList;

// public class Fileoperation {
  
//     public static void savetothefile(ArrayList<Employee>emp,String filename){
//         try {
//             BufferedWriter wr=new BufferedWriter(new FileWriter(filename));
            
//             for(Employee e:emp){
//                 if(e instanceof FullTimeEmployee f){
//                    wr.write("FULLTIME," + f.getId() + ","
//                             + f.getName() + ","
//                             + f.calculateSalary());
//                 }

//                    if(e instanceof PartTimeEmployee p){
//                    wr.write("FULLTIME," + p.getId() + ","
//                             + p.getName() + ","
//                             + p.calculateSalary());
//                 }

//                    if(e instanceof ContractEmployee c){
//                    wr.write("FULLTIME," + c.getId() + ","
//                             + c.getName() + ","
//                             + c.calculateSalary());
//                 }
//                 wr.newLine();
      
//                }
//                 System.out.println("Employees saved successfully!");

//             wr.close();

//         } catch (IOException e) {
//             
//             e.getMessage();
//         }
//     }

//    public static void loadtofile(ArrayList<Employee>emp,String filename){
//     try {
//          BufferedReader reader =new BufferedReader(new FileReader(filename));
         
//          ArrayList<Employee> loaded = new ArrayList<>();
//          String line;

//          int id;
//          String name;
//          double salary;

//          while((line=reader.readLine()) !=null){
//               String [] data=line.split(",",-1);
//              switch (data[0]) {
//                 case "FULLTIME":
//                     id = Integer.parseInt(data[1]);
//                      name = data[2];
//                      salary=Double.parseDouble(data[3]);
//                      loaded.add(new FullTimeEmployee(id, name, salary,0));

                    
//                     break;

//                 case "PARTTIME":
//                      id = Integer.parseInt(data[1]);
//                      name = data[2];
//                     salary=Double.parseDouble(data[3]);
//                     loaded.add(new PartTimeEmployee(id, name, salary,0));
//                     break;

//                  case "CONTRACT":   
//                  id = Integer.parseInt(data[1]);
//                      name = data[2];
//                     salary=Double.parseDouble(data[3]);
//                     loaded.add(new ContractEmployee(id, name, salary));
//                     break;
    
             
//                 default:
//                     break;
//              }
              
//          }



        
//     } catch (Exception e) {
//         
//         e.getMessage();
//     }
     

//    } 
// }


package oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Fileoperation {

    // SAVE DATA TO FILE
    public static void savetothefile(
            ArrayList<Employee> emp, String filename) {

        try (BufferedWriter wr =
                new BufferedWriter(new FileWriter(filename))) {

            for (Employee e : emp) {

                if (e instanceof FullTimeEmployee f) {
                    wr.write(f.getRole()+"," + f.getId() + ","
                            + f.getName() + ","
                            + f.getmonthlysal()+","+f.getbonus());
                }

                else if (e instanceof PartTimeEmployee p) {
                    wr.write(p.getRole() +"," + p.getId() + ","
                            + p.getName() + ","
                            + p.gethourrate()+","+p.gethours());
                }

                else if (e instanceof ContractEmployee c) {
                    wr.write(c.getRole() + "," + c.getId() + ","
                            + c.getName() + ","
                            + c.getAmount());
                }

                wr.newLine();
            }

            System.out.println("Employees saved successfully!");
            System.out.println("File location: "
                    + new java.io.File(filename).getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Save error: " + e.getMessage());
        }
    }


    // LOAD DATA FROM FILE
    public static void loadtofile(
            ArrayList<Employee> emp, String filename) {

        try (BufferedReader reader =
                new BufferedReader(new FileReader(filename))) {

            ArrayList<Employee> loaded = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",", -1);

                int id ;
                String name;
                String type;
               

                switch (data[0]) {


                    case "FULLTIME" -> {
                        type=data[0];
                        id = Integer.parseInt(data[1]);
                        name = data[2];
                       
                        double salary = Double.parseDouble(data[3]);
                        double bonus = Double.parseDouble(data[4]);

                        loaded.add(new FullTimeEmployee(type,
                                id, name, salary, bonus));
                    }

                    case "PARTTIME" -> {
                        type=data[0];
                        id = Integer.parseInt(data[1]);
                        name = data[2];
                        double hours = Double.parseDouble(data[3]);
                        double rate = Double.parseDouble(data[4]);

                        loaded.add(new PartTimeEmployee(type,
                                id, name, hours, rate));
                    }

                    case "CONTRACT" -> {
                        type=data[0];
                        id = Integer.parseInt(data[1]);
                        name = data[2];
                        double amount = Double.parseDouble(data[3]);

                        loaded.add(new ContractEmployee(type,
                                id, name, amount));
                    }

                    default -> System.out.println(
                            "Unknown employee type: " + data[0]);
                }
            }
        
            

            // Replace the existing list with loaded employees
            emp.clear();
            emp.addAll(loaded);

            System.out.println("Employees loaded successfully!");
            System.out.println("Total employees: " + emp.size());

        } catch (IOException e) {
            System.out.println("Load error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid employee data in file.");
        }
    }
}

