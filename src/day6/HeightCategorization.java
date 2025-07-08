package day6;

public class HeightCategorization {
    public static void main(String[] args) {
        System.out.println(heightOfAPersion(130));
    }

    public static String heightOfAPersion(int height) {
        if (height >= 135) {
            return "dwarf";
        } else {
            return "short";
        }
    }
}
