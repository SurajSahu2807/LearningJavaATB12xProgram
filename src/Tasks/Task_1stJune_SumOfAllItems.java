package Tasks;

public class Task_1stJune_SumOfAllItems {
    public static void main(String[] args) {
        /*
            Sum of All Items of the Array
        */
        int[] array;
        array = new int[]{64,235,1,5767,23,2,99,1,70};
        int sum = 0;
        for(int n = 0; n <= array.length - 1 ; n++){
          sum = sum + array[n];
        }
        System.out.println("Sum of all elements in an array :- " + sum);
    }
}
