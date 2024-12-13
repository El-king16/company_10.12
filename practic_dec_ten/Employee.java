package practic_dec_ten;

public abstract class Employee {
    protected String name;
    protected int age;
    protected int baseSalary;

    public Employee(String name, int age, int baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public abstract int getSalary();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
