package Tasks;

import java.util.Arrays;

public class Task_1stJune2025_ElementsInReverseOrder {
    public static void main(String[] args) {
        // Elements of an Array in Reverse Order.
        /*
            arr.length % 2 == 0 ---> No Need to iterate till center.
            arr.length % 2 != 0 ---> iterate till center.
         */
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int i = 0 ; i < (arr.length/2) ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
