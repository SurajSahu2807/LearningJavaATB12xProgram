package Tasks;

public class Task_1stJune_OddNEvenInArray {
    /*
        Odd and Even Numbers from an Array
    */
    public static void main(String[] args) {
        int[] array;
        array = new int[]{64,235,1,5767,23,2,99,1,70};
        for(int n = 0; n <= array.length - 1 ; n++){
            if(array[n] % 2 == 0){
                System.out.println("At index -> " + n + "th element -> " + array[n] + " even");
            }else{
                System.out.println("At index -> " + n + "th element -> " + array[n] + " odd");
            }
        }
    }
}
