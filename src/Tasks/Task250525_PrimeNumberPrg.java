package Tasks;
import java.util.Scanner;

public class Task250525_PrimeNumberPrg {
    public static void main(String[] args) {
            /*
                What is prime number
            --> The number which is divisible by 1 and its self
               Example --> 2,3,5,7,11,13,17,19,23,29,31

             */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            if(input == 0 || input == 1 ){
                System.out.println("Prime number starts from 2 onwards");
            }else if( input == 2 ){
                System.out.println("The Given Input is an Prime Number");
            }else if ( input < 0) {
                System.out.println("Prime numbers are greather than 1 . Please enter an valid number");
            }else{
                int count = 0;
                for(int i = 2 ; i <= Math.sqrt(input) ; i++ ){
                    if(input % i == 0){
                        System.out.println("The Given input is not an Prime Number as it is divisible by : " + i);
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    System.out.println("The Given input is an Prime Number");
                }
            }
        }else{
            System.out.println("Please Enter an Valid Integer input");
        }
    }
}
