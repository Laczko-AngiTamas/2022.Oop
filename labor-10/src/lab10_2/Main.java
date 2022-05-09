package lab10_2;

import oop.labor10.lab10_1.MyDate;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Last Generation Networks");
        company.hire(new Manager("Eduard", "Jakab", 6000,
                new MyDate(1990, 11, 13), "Client State"));

        company.hire(new Employee("Tamas", "Laczko-Angi", 4000, new MyDate(2002, 02, 11)));
        company.hire(new Employee("Balazs", "Mate", 4000, new MyDate(2003, 03, 15)));

       company.sortByComparator(new Comparator<Employee>() {
           @Override
           public int compare(Employee o1, Employee o2) {
               return o1.getBirthDate().compareTo(o2.getBirthDate());
           }

       });
    }
}

