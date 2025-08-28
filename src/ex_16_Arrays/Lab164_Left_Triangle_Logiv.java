package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_Left_Triangle_Logiv {
    public static void main(String[] args) {
        /* Print left Angled triangle

        ****
        ***
        **
        *

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a total count of rows and columns");
        int num = scanner.nextInt();
        for( int i = num; i > 0 ; i-- ){
            for(int j = 0; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
