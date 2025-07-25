package com.practice.day18;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 10;                   // system is a predefined class name from java.lang package
        int b = 0;                   // out is a static field in system class and it represents standard out put stream
        try {                    // println is the method of the print stream class that prints and moves to a new line
            int c = a / b;
            System.out.println(c);
            System.exit(1);//if you write System.exit() the code will end hear the finally keyword can not execute
        } catch (ArithmeticException arithmeticException) {
            System.out.println("In catch b the value must be grater than 0");
        } finally {
            System.out.println(" In finally the value must be greater than 0");
        }
    }
}
// object is a class, and it is the super class of all java user defined classes
// throwable is the super class of all java exceptions
// Exception is an event that occurs during the execution of a java program
// that disrupts normal flow of execution
//try // in the try block we write the code where there is a chance of getting exception
// we cant write try block alone, try block must be followed by either catch or finally or catch and finally
// catch
// finally
//throw
//throws