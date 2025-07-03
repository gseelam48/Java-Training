package day3;

public class ArithmeticOpp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = ArithmeticOpp.sum(a, b);
        int diff = ArithmeticOpp.diff(a, b);
        int prod = ArithmeticOpp.prod(a, b);
        int div = ArithmeticOpp.div(a, b);
        System.out.println("sum of two numbers: " + sum);
        System.out.println("diff of two numbers" + diff);
        System.out.println("prod of two numbers" + prod);
        System.out.println("div of two numbers" + div);
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static int prod(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }


}
