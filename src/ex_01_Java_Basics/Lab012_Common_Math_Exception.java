package ex_01_Java_Basics;

public class Lab012_Common_Math_Exception {
    public static void main(String[] args) {
        System.out.println(10/0); // java.lang.ArithmeticException: / by zero
        // Anything divide by 0 --> whenever you want to perform this type of operation there u will
        // this exception as this is not defined as stood by JVM
    }
}
