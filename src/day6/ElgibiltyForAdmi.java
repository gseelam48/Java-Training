package day6;

public class ElgibiltyForAdmi {
    public static void main(String[] args) {
        System.out.println(eligibilityForAdmission(65, 55, 72));
    }

    public static String eligibilityForAdmission(int mathsMarks, int phyMarks, int chemMarks) {
        int total = mathsMarks + phyMarks + chemMarks;
        if (mathsMarks >= 65 && phyMarks >= 55 && chemMarks >= 50) {
            if (total >= 190 || mathsMarks + phyMarks >= 140) {
                return "The candidate is eligible for admission ";
            }
        } else {
            return "The candidate is not eligible for admission";
        }
        return "";
    }
}


