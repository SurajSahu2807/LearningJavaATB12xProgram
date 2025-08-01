package Tasks;
import java.util.Scanner;

public class Task240525_FactorialOfN {
    public static void main(String[] args){
        /*
            Factorial of 5 = 1*2*3*4*5;
         */
        // We have to find the Factorial of N
        Scanner scanner = new Scanner(System.in);
        int total = 1;
        int sum = 0;
        System.out.println("Enter a integer number whose factorial is needed");
        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            if( input != 0 && input > 0) {
            for(int i=1 ;i <= input;i++){
                total = total * i;
            }
            System.out.println("Factorial Value : -  " + total);
        }else if ( input == 0 ){
            System.out.println("Factorial of 0 is :- 1");
        }else if ( Integer.MAX_VALUE < input){
                System.out.println("I can't handle the number > max of Int");
            }else{
                System.out.println("Factorial is not defined for Negative Numbers.");
            }
        }else{
            System.out.println("Enter an correct integer input value");
        }
    }
}
