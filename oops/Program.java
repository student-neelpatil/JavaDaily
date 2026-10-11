package oops;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    private static final ArrayList<Employee> employees =
            new ArrayList<>();
            

    private static final String Filename="oops/file.txt";        

     public static void showMenu() {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Add Employee");
        System.out.println("2. Display Employees");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Employee Name");
        System.out.println("5. Delete Employee");
        System.out.println("6. Sort by Salary (Ascending)");
        System.out.println("7. Sort by Salary (Descending)");
        System.out.println("8. Sort by Name");
        System.out.println("9.save to the file");
        System.out.println("10. load from the file");
        System.out.println("11.exit");
    }        

    private static boolean idExists(int id) {
        return employees.stream()
                .anyMatch(emp -> emp.getId() == id);
    }

    private static Employee findEmployee(int id) {
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // 1. Add employee
    private static void addEmployee() {
        try {
            System.out.println("Enter employee ID: ");
            int id = ConsoleInput.getInt();

            if (id <= 0) {
                throw new IllegalArgumentException(
                        "ID must be positive."
                );
            }

            if (idExists(id)) {
                throw new IllegalArgumentException(
                        "Employee ID already exists."
                );
            }
             
            System.out.println(  "Enter employee name: ");
            String name = ConsoleInput.getString();

            System.out.println(" FULLTIME");
            System.out.println(" PARTTIME");
            System.out.println(" CONTRACT");

            System.out.println("Choose employee type: ");
            String type = ConsoleInput.getString();

            Employee emp;

            switch (type) {
                case "FULLTIME" -> {
                    System.out.println("Enter monthly salary: ");
                    double monthlysalary = ConsoleInput.getDouble(
                            
                    );
                    System.out.println("Enter bonus: ");
                    double bonus = ConsoleInput.getDouble(
                           
                    );

                    emp = new FullTimeEmployee(type,
                            id, name, monthlysalary, bonus
                    );
                }

                case "PARTTIME" -> {
                    System.out.println("Enter hours worked: ");
                    double hours = ConsoleInput.getDouble(
                            
                    );

                    System.out.println( "Enter hourly rate: ");
                    double rate = ConsoleInput.getDouble(
                           
                    );

                    emp = new PartTimeEmployee(type,
                            id, name, hours, rate
                    );
                }

                case "CONTRACT" -> {
                    System.out.println( "Enter contract amount: ");
                    double amount = ConsoleInput.getDouble(
                           
                    );

                    emp = new ContractEmployee(type,
                            id, name, amount
                    );
                }

                default -> throw new IllegalArgumentException(
                        "Invalid employee type."
                );
            }

            employees.add(emp);
            System.out.println("Employee added successfully!");

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Unable to add employee: " + e.getMessage()
            );
        }
    }

    private static void displayDetails(Employee e){
        if(e instanceof FullTimeEmployee f){
        System.out.println("role:"+f.getRole());
        System.out.println("id :"+f.getId());
        System.out.println("name :"+f.getName());
        System.out.println("monthly salary :"+f.getmonthlysal());
        System.out.println("bonus :"+f.getbonus());
        }

        else if(e instanceof PartTimeEmployee p){
        System.out.println("role:"+p.getRole());
        System.out.println("id :"+p.getId());
        System.out.println("name :"+p.getName());
        System.out.println("hour rate :"+p.gethourrate());
        System.out.println("hourly worked  :"+p.gethours());
        }

        else if(e instanceof ContractEmployee c){
        System.out.println("role:"+c.getRole());
        System.out.println("id :"+c.getId());
        System.out.println("name :"+c.getName());
        System.out.println("amount is  :"+c.getAmount());
        
        }
        else{
            System.out.println("object is not of given ty");
        }

        
    }

    // 2. Display employees
    private static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        for(Employee e:employees){
            displayDetails(e);
        }  

        
    }

    // 3. Search employee
    private static void searchEmployee() {
        System.out.println("Enter employee ID to search: ");
        int id = ConsoleInput.getInt(
                
        );

        Employee emp = findEmployee(id);

        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }

       displayDetails(emp);
    }

    // 4. Update employee name
    private static void updateEmployee() {
        System.out.println( "Enter employee ID to update: ");
        int id = ConsoleInput.getInt(
               
        );

        Employee emp = findEmployee(id);

        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }
          
        System.out.println("enter new name");
        String newName = ConsoleInput.getString();

        emp.setName(newName);
        System.out.println("Employee updated successfully!");
    }

    // 5. Delete employee
    private static void deleteEmployee() {
        System.out.println( "Enter employee ID to delete: ");
        int id = ConsoleInput.getInt(
               
        );

        Employee emp = findEmployee(id);

        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }

        employees.remove(emp);
        System.out.println("Employee deleted successfully!");
    }

    // 6. Sort by salary: lowest to highest
    private static void sortBySalaryAscending() {
        List<Employee> sorted = employees.stream()
                .sorted(
                    Comparator.comparingDouble(
                        Employee::calculateSalary
                    )
                )
                .toList();

        sorted.forEach(e->displayDetails(e));
    }

    // 7. Sort by salary: highest to lowest
    private static void sortBySalaryDescending() {
        List<Employee> sorted = employees.stream()
                .sorted(
                    Comparator.comparingDouble(
                        Employee::calculateSalary
                    ).reversed()
                )
                .toList();

        sorted.forEach(e->displayDetails(e));;
    }

    // 8. Sort alphabetically by name
    private static void sortByName() {
        List<Employee> sorted = employees.stream()
                .sorted(
                    Comparator.comparing(Employee::getName)
                )
                .toList();

        sorted.forEach(e->displayDetails(e));;
    }

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("=== Employee Management System ===");

         do{
            try {
                showMenu();
                System.out.println("enter choice");
                int choice = ConsoleInput.getInt();

                switch (choice) {
                    case 1 -> addEmployee();
                    case 2 -> displayEmployees();
                    case 3 -> searchEmployee();
                    case 4 -> updateEmployee();
                    case 5 -> deleteEmployee();
                    case 6 -> sortBySalaryAscending();
                    case 7 -> sortBySalaryDescending();
                    case 8 -> sortByName();
                    case 9 -> Fileoperation.savetothefile(employees,Filename);
                    case 10 ->Fileoperation.loadtofile(employees,Filename);
                    case 11 -> {
                        running = false;
                        System.out.println("Program closed.");
                    }
                    default -> System.out.println(
                            "Invalid menu choice. Select 1-9."
                    );
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Input error: " + e.getMessage());

            } catch (IllegalStateException e) {
                System.out.println(
                        "Input unavailable: " + e.getMessage()
                );
                running = false;

            } catch (RuntimeException e) {
                System.out.println(
                        "Unexpected error: " + e.getMessage()
                );
                System.out.println(
                        "Returning to the main menu."
                );
            }
        }while(running);
    }

   

    
}


