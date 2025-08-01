package ex_11_While;
import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        // FigureOut the data type for Varibales for (Inputs and Outputs)
        // Write a rough logic around this
        // Write a proper logic around this
        // Optimize
        // Cover Edge cases

        // factorial
        /*
        intialization
        while( conditon ){
            // Statement
            // Updation (Increment/Decrement)
         */
        /* 5! = 1*2*3*4*5;
           1! = 1;
           0! = 1;
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            int fact = 1;
            if(input <= 0){
                System.out.println("Factorial of 0 is :- 1");
            }else if (Integer.MAX_VALUE < input) {
                System.out.println("I can't handle the input number which is greather than maximum permissible value of integer datatype");
            }else{
                    int i = 1; // Initialization
                    while(i <= input){ // Condition
                        fact = fact * i;
                        i++; // updation
                    }
                System.out.println("Factorial of " + input + " is " + fact);
                }
            } else{
            System.out.println("Provide a Valid Integer Input");
        }
    }

}
