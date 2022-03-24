package oop.labor10.lab10_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    /*MyDate date1 = new MyDate(2022,3, 3);
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
    System.out.println(DateUtil.isValidDate(2020,1, 31) == true);*/
        ArrayList<MyDate> dates = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int month = rand.nextInt(1, 12);
            int day = rand.nextInt(1, 31);
            MyDate date1 = new MyDate(2022, month, day);
            if (DateUtil.isValidDate(date1.getYear(), date1.getMonth(), date1.getDay())) {
                dates.add(date1);
                i++;
            }
        }
        for (MyDate o : dates) {
            System.out.println(o);
        }
        System.out.println("________");
        Collections.sort(dates);
        for(MyDate o:dates) {
            System.out.println(o);
        }

    }

}

