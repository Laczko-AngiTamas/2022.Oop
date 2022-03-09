package oop.labor02.date;

import java.util.Date;

public class Main {
public static void main(String[] args) {
    MyDate date1 = new MyDate(2022,3, 3);
    System.out.println(date1);
    System.out.println(DateUtil.isValidDate(2000,2,29)== true);
    System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
    System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
    System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
    System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
    System.out.println(DateUtil.isValidDate(0,2, 28) == false);
    System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
    System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
    System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
    System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
    System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
    System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
    System.out.println(DateUtil.isValidDate(2020,1, 31) == true);

}
}

