package day5;

// which takes one int as argument and retun string as a output
public class WeekDaysEx {
    public static void main(String[] args) {
        int num = 6;
        String getWeekDay = getWeekDay(num);
        System.out.println(getWeekDay);
    }

    public static String getWeekDay(int num) {
        if (num == 1) {
            return "monday";
        } else if (num == 2) {
            return " Tue ";
        } else if (num == 3) {
            return " Wed ";
        } else if (num == 4) {
            return " Thr ";
        } else if (num == 5) {
            return " Fri ";
        } else if (num == 6) {
            return "Sat";
        } else if (num == 7) {
            return " Sun ";
        } else {
            return "Enter a valid num";
        }
    }
}
