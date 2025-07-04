package day3;

public class CondSta {
    public static void main(String[] args){
        int x = 8;
        int y = 9;
        int z = 10;
        if(x>z||z>x)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}
