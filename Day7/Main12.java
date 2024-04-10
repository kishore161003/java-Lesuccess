package Day7;

import java.sql.Date;
import java.util.Scanner;

class DateTime {
    int Hours, Minutes, Date, Month, Year;

    void init(int Hours, int minutes, int Date, int month, int year) {
        this.Date = Date;
        this.Hours = Hours;
        this.Minutes = minutes;
        this.Month = month;
        this.Year = year;
    }

    void Display() {
        System.out.println("Date :" + Date + "-" + Month + "-" + Year);
        System.out.println("Time :" + Hours + " hrs " + Minutes + " mins");
        System.out.println("Total mins: " + ((Hours * 60) + Minutes));
    }
}

public class Main12 {

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrs = sc.nextInt();
        int min = sc.nextInt();
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if ((0 <= hrs && hrs <= 24) && (0 <= min && min <= 60)
                && (0 <= date && date <= 31)
                && (0 <= month && month <= 12) && (0 <= year && year <= 9999)) {
            if (isLeapYear(year)) {
                if (month == 2 && date > 29) {
                    System.out.println("Invalid");
                    return;
                }

            }
            DateTime dt = new DateTime();
            dt.init(hrs, min, date, month, year);
            dt.Display();

        } else {
            System.out.println("Invalid");
        }
    }

}
