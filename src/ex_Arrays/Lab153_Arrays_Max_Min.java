package ex_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        // Finding Max number
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        int mini = array[0];

        for(int i = 1; i <array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum number in Array :- " + max);

        for(int i = 1; i<array.length;i++){
            if(mini > array[i]){
                mini = array[i];
            }
        }
        System.out.println("Minimum number in Array :- " + mini);


    }
}
