package practic_dec_ten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Company {
    private List<Employee> employees;
    private Random random;

    public Company() {
        employees = new ArrayList<>();
        random = new Random();
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }


    public void fireEmployee(Employee employee) {
        employees.remove(employee);
    }

    public int getCompanyIncome() {
        return random.nextInt(100000) + 150000;
    }

    public void sortEmployeesBySalaryAscending() {
        Collections.sort(employees, Comparator.comparingInt(Employee::getSalary)); //надеюсь вы не обижаетесь что я сортировку через компаратор сделал
    }

    public void sortEmployeesBySalaryDescending() {
        Collections.sort(employees, Comparator.comparingInt(Employee::getSalary).reversed());
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

