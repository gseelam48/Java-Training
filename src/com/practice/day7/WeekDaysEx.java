package com.practice.day7;

// which takes one int as argument and retun string as a output
public class WeekDaysEx {
    public static void main(String[] args) {
        int num = 2;
        String getWeekDay = getWeekDay3(num);
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

    public static String getWeekDay1(int num) {
        switch (num) {
            case 1:
                return "Monday";
            case 2:
                return "Tue";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "friday";
            case 6:
                return "saturday";
            case 7:
                return "sunday";
            default:
                return "Enter a valid num";
        }

    }

    public static String getWeekDay2(int num) {
        return switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "Enter a valid num";
        };

    }

    public static String getWeekDay3(int num) {
        String result;
        switch (num) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tue";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "friday";
                break;
            case 6:
                result = "saturday";
                break;
            case 7:
                result = "sunday";
                break;
            default:
                result = "Enter a valid num";
        }

        return result;
    }
}

