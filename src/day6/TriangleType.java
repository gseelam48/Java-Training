package day6;

public class TriangleType {
    public static void main(String[] args) {
        System.out.println(typeOfTriangle(70, 30, 40));

    }

    public static String typeOfTriangle(int x, int y, int z) {
        if (x == y && y == z && z == x) {
            return "Equilateral";
        } else if (x != y && y != z && z != x) {
            return " Scalene ";
        } else {
            return "Isosceles";
        }
    }
}
