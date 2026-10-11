package oops;



public abstract class Employee {

    private int id;
    private String name;
     private String role;

    public Employee(String role,int id, String name) {
        if (id <= 0) {
            throw new IllegalArgumentException(
                "Employee ID must be positive."
            );
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                "Employee name cannot be empty."
            );
        }

        this.id = id;
        this.name = name.trim();
        this.role=role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                "Name cannot be empty."
            );
        }

        this.name = name.trim();
    }

    public abstract double calculateSalary();

   
}
