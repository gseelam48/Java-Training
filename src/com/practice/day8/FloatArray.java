package com.practice.day8;

public class FloatArray {
    public static void main(String[] args) {
        float[] marks = new float[3];
        marks[0] = 87.5f;
        marks[1] = 90.2f;
        marks[2] = 78.8f;

        System.out.println(marks[0] + ":" + marks[1] + ":" + marks[2]);

        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            float avg = sum / marks.length;
            System.out.println("Average marks: " + avg);
        }


    }
}
