package Tasks;

public class Task_1stJune_SmallestElementInArray {
    public static void main(String[] args) {
        /*
            Print the Smallest Element in an Array
        */
        int[] array;
        array = new int[]{64,235,1,5767,23,2,99,1,70};
        int mini = array[0];
        for(int n = 1; n <= array.length - 1 ; n++){
            if( array[n] < mini ){
                mini = array[n];
            }
        }
        System.out.println("Maximum value in an array is :- " + mini);
    }
}
