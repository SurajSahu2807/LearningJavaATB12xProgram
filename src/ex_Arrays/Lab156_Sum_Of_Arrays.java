package ex_Arrays;

import com.sun.security.jgss.GSSUtil;

public class Lab156_Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] numbers  = { 12,34,10 };
        int sum = 0;
        for( int i = 0 ; i < numbers.length ; i++ ){
            sum = sum + numbers[i];
        }
        System.out.println("Sum of all elements : - " + sum);
    }

}
