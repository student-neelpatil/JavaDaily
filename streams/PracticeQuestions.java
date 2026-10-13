package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PracticeQuestions {
    public static void main(String[] args) {
        
    ArrayList <Product>products=new ArrayList<>();
    ArrayList <Student>students=new ArrayList<>();
    ArrayList <Employee>employees=new ArrayList<>();

employees.add(new Employee(1, "Amit", "IT", 60000, 3));
employees.add(new Employee(2, "Priya", "HR", 45000, 5));
employees.add(new Employee(3, "Rahul", "IT", 75000, 6));
employees.add(new Employee(4, "Neha", "HR", 50000, 4));
employees.add(new Employee(5, "Karan", "Finance", 80000, 8));
employees.add(new Employee(6, "Sneha", "IT", 90000, 9));
employees.add(new Employee(7, "Vijay", "Finance", 65000, 5));
employees.add(new Employee(8, "Amit", "Sales", 40000, 2));

products.add(new Product(1, "Laptop", "Electronics", 50000, 2));
products.add(new Product(2, "Mouse", "Electronics", 500, 10));
products.add(new Product(3, "Keyboard", "Electronics", 2000, 5));
products.add(new Product(4, "Monitor", "Electronics", 10000, 3));
products.add(new Product(5, "Chair", "Furniture", 5000, 4));
products.add(new Product(6, "Desk", "Furniture", 12000, 2));
products.add(new Product(7, "Phone", "Electronics", 30000, 3));
products.add(new Product(8, "Notebook", "Stationery", 100, 50));

students.add(new Student(1, "Aarav", "Computer", 85, 21));
students.add(new Student(2, "Priya", "IT", 92, 20));
students.add(new Student(3, "Rahul", "Computer", 35, 22));
students.add(new Student(4, "Neha", "IT", 78, 21));
students.add(new Student(5, "Karan", "Mechanical", 65, 23));
students.add(new Student(6, "Sneha", "Computer", 92, 20));
students.add(new Student(7, "Vijay", "Mechanical", 40, 22));
students.add(new Student(8, "Ananya", "IT", 55, 19));


    
// Q1. Filter products by price Display all products whose price is greater than ₹1,000.
// Concept: filter()


products.stream().filter(e->e.price()>1000).forEach(System.out::println);




// Q2. Extract employee names
// Create a list containing only employee names, not complete employee objects.
// Concept: map()

employees.stream().map(e->e.name()).forEach(System.out::println);




// Q3. Find students who passed
// Display students with marks greater than or equal to 40.
// Concept: filter() and forEach()

students.stream().filter(e->e.marks()>40).forEach(System.out::println);




// Q4. Convert names to uppercase
// Return a list of all employee names in uppercase.
// Concept: map() and collect()

employees.stream().map(e->e.name().toUpperCase()).collect(Collectors.toList());


// Level 2 — Sorting objects using fields and calculations

// Q5. Sort products by price
// Sort products from lowest price to highest price.
// Concept: sorted() and Comparator.comparingDouble()



// Q6. Sort employees by salary descending
// Display the highest-paid employee first.
// Concept: reversed()




// Q7. Sort products by total inventory value
// Calculate:
// {Inventory Value}={price}*{quantity}

// Sort products from highest inventory value to lowest.
// Concept: custom comparator and calculated sorting keys




// Q8. Sort employees by annual salary
// Calculate salary × 12 and sort employees by annual salary, highest first.
// Concept: sorting by an expression instead of a single field



// Q9. Sort students by marks, then age
// Sort by marks descending. If two students have the same marks, put the younger student first.
// Concept: thenComparing()


//Level 3 — Finding values and aggregating results


// Q10. Find the most expensive product
// Return the product with the highest price.
// Concept: max() and Optional

// Q11. Find the employee with the longest experience
// Return the employee with the highest years of experience.
// Concept: max() with a comparator

// Q12. Calculate the total inventory value
// Calculate the sum of price × quantity for every product.
// Concept: mapToDouble() and sum()

// Q13. Calculate the average student marks
// Find the average marks across all students.
// Concept: mapToDouble() and average()

// Q14. Find the second-highest salary
// Find the second-highest distinct employee salary.
// Concept: map(), distinct(), sorted(), skip(), findFirst()

// Level 4 — Combining multiple stream operations


// Q15. Filter and sort together
// Display IT employees earning more than ₹50,000, ordered by salary descending.
// Concept: filter() → sorted() → forEach()

// Q16. Get the top three products
// Return the three products with the highest price × quantity.
// Concept: sorted() → limit() → toList()

// Q17. Group employees by department
// Create a map where the department is the key and its employees are the values.
// Concept: Collectors.groupingBy()

// Q18. Count employees in each department
// Return a map such as IT → 4, HR → 2.
// Concept: groupingBy() and counting()

// Q19. Find the highest salary in every department
// Return each department with its highest-paid employee.
// Concept: groupingBy() and maxBy()

// Q20. Calculate total salary expenditure by department
// Return the sum of salaries for every department.
// Concept: groupingBy() and summingDouble()

// Level 5 — Advanced logical challenges

//Q21	Find duplicate employee names	
//Q22	Partition students into pass and fail groups	
//Q23	Find the product with the greatest inventory value in each category	
//Q24	Generate a comma-separated list of student names	
//Q25	Calculate total inventory value using 
//Q26	Find all products whose inventory value exceeds the average inventory value	
//Q27	Find the department with the highest total salary expenditure	
//Q28	Rank students by marks and assign positions	, indexing or custom result objects

    }


}