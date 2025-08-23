package Tasks;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task250525_FibonacciSeries {
    public static void main(String[] args){
        /*

         How Fibonacci Series work
         0,1,1,2,3,5,8,13,21---------
         Index
         0,1,2,3,4,5,6, 7, 8

         Problem Statement :-
         Write a function or program that calculates the Nth Fibonacci number.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth Fibonacci number index");
        if(scanner.hasNextInt()){
            int nth = scanner.nextInt();
            if( nth < 0 ) {
                System.out.println("Enter an positive integer input");
            }else if(nth == 0){
                System.out.println("Fibonacci number at index 0 is 0");
            }else if(nth == 1){
                System.out.println("Fibonacci number at index 1 is 1");
            }else{
                int n1 = 0;
                int n2 = 1;
                int sum = 0;
                for(int i = 2 ; i <= nth ; i++){
                    sum = n1 + n2;
                    n1 = n2;
                    n2 = sum;
                }
                System.out.println("Fibonacci number at index :- " + nth + " is " + sum);
            }
        }else{
            System.out.println("Please Enter an Valid Integer input ");
        }
    }
}
