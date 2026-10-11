package oops;


public class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee( String role,
            int id, String name,double contractAmount) {

        super(role,id, name);

        if (!Double.isFinite(contractAmount)
                || contractAmount < 0) {
            throw new IllegalArgumentException(
                "Contract amount must be a valid non-negative number."
            );
        }

        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }

    public  double getAmount(){
        return contractAmount;
    }
}

