package day6;

public class TempBasedWeatherMess {
    public static void main(String[] args) {
        System.out.println(getTempMessage(27));

    }

    public static String getTempMessage(int temp) {
        if (temp >= 40) {
            return " its very hot";
        } else if (temp >= 31 && temp <= 40) {
            return "its hot";
        } else if (temp >= 21 && temp <= 30) {
            return "its normal";
        } else if (temp >= 11 && temp <= 20) {
            return "its cold";
        } else if (temp >= 1 && temp <= 10) {
            return "its very cold";
        } else if (temp <= 0) {
            return "its freezing";
        } else {
            return "null";
        }
    }

}
