package oops;


public class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(
        String role,
            int id, String name,
            double hoursWorked, double hourlyRate) {

        super(role,id, name);

        if (!Double.isFinite(hoursWorked)
                || hoursWorked < 0
                || !Double.isFinite(hourlyRate)
                || hourlyRate < 0) {
            throw new IllegalArgumentException(
                "Hours and hourly rate must be valid non-negative numbers."
            );
        }

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    public  double gethours(){
        return hoursWorked;
    }
    public  double gethourrate(){
        return hourlyRate;
    }
    
    
}
