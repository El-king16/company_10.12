package practic_dec_ten;

public class Operator extends Employee{
    private int companyIncome;

    public Operator(String name, int age, int baseSalary) {
        super(name, age, baseSalary);
        this.companyIncome = companyIncome;
    }



    @Override
    public int getSalary() {
        return baseSalary + (int) (0.05 * baseSalary);
    } //бонус 5 %
}
