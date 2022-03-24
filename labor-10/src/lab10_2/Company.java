package lab10_2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee emp) {
        employees.add(emp);
    }

    public void printAll(PrintStream printStream) {
        for (Employee emp : employees) {
            printStream.println(emp);
        }
    }

    public void sortByComparator(Comparator<Employee> employeeComparator) {
        Collections.sort(employees, employeeComparator);
    }
}
