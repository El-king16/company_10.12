package practic_dec_ten;

public class TopManager extends Employee {
    private int companyIncome;

    public TopManager(String name, int age, int baseSalary, int companyIncome) {
        super(name, age, baseSalary);
        this.companyIncome = companyIncome;
    }

    @Override
    public int getSalary() {
        if (companyIncome > 10000000) {
            return baseSalary + (int) (1.5 * baseSalary);//если оклад больше 10млн то бонус в 150%
        }
        return baseSalary;
    }
}

