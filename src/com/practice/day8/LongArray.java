package com.practice.day8;

public class LongArray {
    public static void main(String[] args) {
        long[] salary = new long[3];
        salary[0] = 40000L;
        salary[1] = 60000L;
        salary[2] = 55000L;

        System.out.println(salary[0] + ":" + salary[1] + ":" + salary[2]);

        long max = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max)
                max = salary[i];
            System.out.println("Maximum salary: " + max);

        }


    }
}
