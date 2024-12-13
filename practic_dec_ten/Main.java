package practic_dec_ten;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Random random = new Random();
        // создание чувачков
        for (int i = 0; i < 120; i++) {
            String name = "оператор " + (i + 1);
            int age = random.nextInt(16) + 25;
            int baseSalary = random.nextInt(100001) + 100000;
            company.hireEmployee(new Operator(name, age, baseSalary));
        }

        for (int i = 0; i < 10; i++) {
            String name = "топ медеджер " + (i + 1);
            int age = random.nextInt(16) + 25;
            int baseSalary = random.nextInt(100001) + 100000;
            int companyIncome = random.nextInt(100000) + 150000;
            company.hireEmployee(new TopManager(name, age, baseSalary, companyIncome));
        }

        for (int i = 0; i < 50; i++) {
            String name = "программист " + (i + 1);
            int age = random.nextInt(16) + 25;
            int baseSalary = random.nextInt(100001) + 100000;
            int companyIncome = random.nextInt(100000) + 150000;
            company.hireEmployee(new Programmer(name, age, baseSalary, companyIncome));
        }

        //вывод топ 15 зарплат
        company.sortEmployeesBySalaryDescending();
        printTopSalaries(company.getEmployees(), 15);

        //вывод топ 30 низких зарплат
        company.sortEmployeesBySalaryAscending();
        printBottomSalaries(company.getEmployees(), 30);


        //увольнение 50 процентов работников
        List<Employee> employeesToFire = new ArrayList<>(company.getEmployees().subList(0, company.getEmployees().size() / 2));
        for (Employee employee : employeesToFire) {
            company.fireEmployee(employee);
        }

        //тот же вывод но после увольнения
        company.sortEmployeesBySalaryDescending();
        printTopSalaries(company.getEmployees(), 15);

        company.sortEmployeesBySalaryAscending();
        printBottomSalaries(company.getEmployees(), 30);
    }

    //метод для вывода топ зп
    private static void printTopSalaries(List<Employee> employees, int count) {
        System.out.println("Топ " + count + " зарплат:");
        for (int i = 0; i < count && i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + ": " + employees.get(i).getSalary());
        }
        System.out.println();
    }

    //тоде метод но для низших зп
    private static void printBottomSalaries(List<Employee> employees, int count) {
        System.out.println("Топ " + count + " маленьких салариес)))):");
        for (int i = 0; i < count && i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + ": " + employees.get(i).getSalary());
        }
        System.out.println();
    }
}


