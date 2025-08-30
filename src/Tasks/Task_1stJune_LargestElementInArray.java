package Tasks;
import java.util.Scanner;

public class Task_1stJune_LargestElementInArray {
    public static void main(String[] args) {
        /*
            Print the Largest Element in an Array.
         */
        int[] array;
        array = new int[]{64,235,12,5767,23,2,99,1,70};
        int max = array[0];
        for(int n = 1; n <= array.length - 1 ; n++){
              if( array[n] > max ){
                  max = array[n];
              }
        }
        System.out.println("Maximum value in an array is :- " + max);

    }
}
