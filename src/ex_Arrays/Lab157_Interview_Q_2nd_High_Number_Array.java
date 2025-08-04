package ex_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 67, 23, 89, 45, 89 };
        int highest = 0;
        int secondhighest = 0;

        for(int num : numbers){
            if(num > highest){
                secondhighest = highest;
                highest = num;
            }else if( num > secondhighest  &&  num != highest){
                secondhighest = num;
            }
        }
        System.out.println(secondhighest);

        //-------------------------------------


    }
}
