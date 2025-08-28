package ex_16_Arrays;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();

        String[] number_Marks = new String[size];
        // int[] number_Marks = new int[size];
        // float[] number_Marks = new float[size];

        for ( int i = 0; i < number_Marks.length;  i++ ){
            System.out.println("Enter the Element");
            number_Marks[i] = scanner.next();
        }

        // printing the values
        for( String mark : number_Marks){
            System.out.println(mark);
        }
        scanner.close();


    }
}
