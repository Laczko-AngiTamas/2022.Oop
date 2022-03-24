package oop.labor10.lab10_1;

public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return year + "." + month + "." + day;
    }

    @Override
    public int compareTo(MyDate o) {
        //this-t hasonlitunk o -val
        if (this.year == o.year) {
            if (this.month == o.month) {
                if (this.day == o.day) {

                }
                return this.day - o.day;
            }
            return this.month - o.month;
        }
        return this.year - o.year;
    }
}


