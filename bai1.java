package TH_tuan_1;

import java.util.Scanner;

public class bai1 {

    public boolean valid_day(int day, int month) {
        if ((month == 2) && (day > 0) && (day < 30)) {
            return true;
        }
        if ((
                (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && ((day > 0) && (day < 32))) {
            return true;
        }
        if ((
                (month == 4) || (month == 6) || (month == 9) || (month == 11)) && ((day > 0) && (day < 31))) {
            return true;
        }
        return false;
    }

    public boolean valid_month(int Month) {
        if ((Month > 0) && (Month < 13)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean valid_year(int Year) {
        if ((Year > 1990)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean leap_year(int year) {
        if (((year % 4) == 0) && ((year % 100) != 0)) {
            return true;
        } else if ((year % 400) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void DayOfTheWeek(String date) {
        Scanner Date = new Scanner(date);
        Date.useDelimiter("/");
//        while (Date.hasNext()){
//            System.out.println(Date.next());
//        }
        int day = Integer.parseInt(Date.next());
        int month = Integer.parseInt(Date.next());
        int year = Integer.parseInt(Date.next());
        if (valid_day(day, month) == true && valid_month(month) == true && valid_year(year) == true) {
            int day_calculate = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
                    (365 * (year + 4800 - ((14 - month) / 12))) +
                    ((year + 4800 - ((14 - month) / 12)) / 4) -
                    ((year + 4800 - ((14 - month) / 12)) / 100) +
                    ((year + 4800 - ((14 - month) / 12)) / 400) - 32045) % 7;
            switch (day_calculate) {
                case 0: {
                    System.out.println("Thứ 2");
                    break;
                }
                case 1: {
                    System.out.println("Thứ 3");
                    break;
                }
                case 2: {
                    System.out.println("Thứ 4");
                    break;
                }
                case 3: {
                    System.out.println("Thứ 5");
                    break;
                }
                case 4: {
                    System.out.println("Thứ 6");
                    break;
                }
                case 5: {
                    System.out.println("Thứ 7");
                    break;
                }
                case 6: {
                    System.out.println("Chủ nhật");
                    break;
                }
                default:
                    break;
            }
        } else {
            System.out.println("Ngày tháng không hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        bai1 dotw = new bai1();
        System.out.print("Nhập ngày tháng năm (dđ/mm/yyyy): ");
        String date = s.next();
        dotw.DayOfTheWeek(date);
    }
}
