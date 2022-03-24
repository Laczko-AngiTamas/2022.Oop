package oop.labor10.lab10_1;

public class DateUtil {
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
        public static boolean isValidDate ( int year, int month, int day){
            if (month > 12 || month < 1 || year <= 0 || day <= 0 || day > 31) {
                return false;
            }
            if (isLeapYear(year) && month == 2 && day > 29) {
                return false;
            }
            if (!isLeapYear(year) && month == 2 && day > 28) {
                return false;
            }
            return !((month == 4 || month == 6 || month == 9 || month == 11) && day > 30);


    }
}
