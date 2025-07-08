package day6;

public class QuadrentIdentification {
    public static void main(String[] args) {
        System.out.println(getQuadrent(7, 8));
    }

    public static String getQuadrent(int x, int y) {
        if (x < 0 && y > 0) {
            return "First Quadrent";
        } else if (x > 0 && y > 0) {
            return "Second Quadrent";
        } else if (x < 0 && y < 0) {
            return "Third Quadrent";
        } else if (y < 0 && x > 0) {
            return "Fourth Quadrent";
        } else if (x == 0 && y == 0) {
            return "Lies on origin";
        }
        return "null";
    }
}
