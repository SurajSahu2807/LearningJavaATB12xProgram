package ex_Arrays;
import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args) {
        /* Print Right Angled triangle

        *
        **
        ***
        ****

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a total count of rows and columns");
        int num = scanner.nextInt();
        for( int i = 0; i < num ; i++ ){
            for(int j = 0; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
