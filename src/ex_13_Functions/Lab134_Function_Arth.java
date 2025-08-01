package ex_13_Functions;
import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {

        /*
        Create a function of Sub, Mul , Sum and Div
        with parameter , a , b ( Take the parameter from the user )
         */

        // 5 Steps to write the program are
        /*
        1st) Analyze and Decide the data type for Input and Output
        2nd) Considering the above details write a rough logic
        3rd) Write a clear Logic
        4th) Optimize the code
        5Th) Cover the Edge Cases
         */

        float a = 0;
        float b = 0;
        Scanner scanner = new Scanner(System.in) ;
         a = takingUserInput(scanner,"Enter the value of num1");
         b = takingUserInput(scanner,"Enter the value of num2");
        System.out.println("Input taking for a is :- " + a + " and  b is :- " + b);

        float result_sum = Addition(a,b);
        float result_sub = Subtraction(a,b);
        float result_mul = Multiplcation(a,b);
        float result_Div = div(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_Div);

    }

    static float takingUserInput(Scanner scanner , String prompt){
        float num = 0;
        System.out.println(prompt);
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
            return num;
        }else{
            System.out.println("Enter the only float value");
            System.exit(0);
            return -1; // Unreachable , but required for the compilation
        }

    }

    static float Subtraction(float a, float b){
        return a-b;
    }

    static float Multiplcation(float a, float b){
        return a*b;
    }

    static float Addition(float a, float b){
        return a+b;
    }

    static float div(float a, float b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
            return a/b;
    }

}
