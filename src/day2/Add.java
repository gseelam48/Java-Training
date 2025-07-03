package day2;

public class Add {
    public static void main(String[] args) {
        byte byteval = 10;
        short shortval = 20;
        int intResult = byteval + shortval;
        byte byteresult = (byte) (intResult);

        System.out.println("integer int :" + byteresult);
    }
}
