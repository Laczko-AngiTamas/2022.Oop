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
    public void fire(int emp) {
        employees.remove(emp);
    }
    public void hireAll(String emp) {
        for(int i = 0; i< emp.length(); i++) {
         // employees.add()

        }
    }


    public void printAll(PrintStream printStream) {
        for (Employee emp : employees) {
            printStream.println(emp);
        }
    }
    public void printManagers(PrintStream pst) {
        for (Employee emp : employees) {


        }
    }

    public void sortByComparator(Comparator<Employee> employeeComparator) {
        Collections.sort(employees, employeeComparator);
    }


}
