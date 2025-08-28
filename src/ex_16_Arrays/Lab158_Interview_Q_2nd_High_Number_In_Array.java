package ex_16_Arrays;

import java.util.Arrays;

public class Lab158_Interview_Q_2nd_High_Number_In_Array {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 67, 23, 77, 45, 89 };
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
