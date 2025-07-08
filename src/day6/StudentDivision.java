package day6;

public class StudentDivision {
    public static void main(String[] args) {
        int rollNo = 748;
        String name = "GopiReddy";
        System.out.println(rollNo + "\n" + name);
        System.out.println(getDivision(90, 80, 85));
    }

    public static String getDivision(int phyMarks, int cheMarks, int computerAppMarks) {
        int total = phyMarks + cheMarks + computerAppMarks;
        int percentage = (total * 100) / 300;
        if (total >= 200 && percentage >= 80) {
            return "first division";
        } else if (total >= 105 && percentage >= 35) {
            return "second division";
        } else

            return "fail";
    }
}
