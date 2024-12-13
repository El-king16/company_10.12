package practic_dec_ten;

public class Programmer extends Employee {
    private int companyIncome;

    public Programmer(String name, int age, int baseSalary, int companyIncome) {
        super(name, age, baseSalary);
        this.companyIncome = companyIncome;
    }

    @Override
    public int getSalary() {
        return baseSalary + (int) (0.1 * companyIncome); //бонус 10 %
    }
}


