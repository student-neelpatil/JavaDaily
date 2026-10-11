package oops;


public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    private double bonus;
   

    public FullTimeEmployee(
            String role,
            int id, String name,
            double monthlySalary, double bonus) {

        super(role,id, name);

        if (!Double.isFinite(monthlySalary)
                || monthlySalary < 0
                || !Double.isFinite(bonus)
                || bonus < 0) {
            throw new IllegalArgumentException(
                "Salary and bonus must be valid non-negative numbers."
            );
        }
         
        
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }

    public double getmonthlysal(){
        return monthlySalary;
    }

    public double getbonus(){
        return bonus;
    }
}

