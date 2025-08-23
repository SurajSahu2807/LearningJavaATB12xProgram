package Tasks;

import java.util.Scanner;

public class Task250525_ArmStrongNumber {
    public static void main(String[] args) {
        /*
        It is a number that is equal to the sum of its own digits -
        each raised to the power of the number of digits.
        123 = 1^3 * 2^3 * 3^3
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an valid whole number");
        if(scanner.hasNextLong()){
            long UserInput = scanner.nextLong();
            long num = UserInput;
            if( num < 0){
                System.out.println("Armstrong number works for non-negative values");
                System.out.println("Provide an valid positive value");
            }else{
                long sum = 1;
                long TotalSum = 0;
                long remainder = 0;
                long count = Total_No_Of_Digits(num) ;
                while(num != 0){
                    remainder = num % 10;
                    num = num / 10;
                    sum = (long) Math.pow( remainder ,  count);
                    TotalSum += sum;
                }
                if( TotalSum == UserInput){
                    System.out.println("The Given Input Number is an Armstrong Number");
                }else{
                    System.out.println("The Given Input Number is not an Armstrong Number");
                }
            }
        }else{
            System.out.println("The Given Input is Invalid . Provide an valid input");
        }
    }

     static long Total_No_Of_Digits(long num){
        long remainder = 0;
        long input = num;
        int count = 0;
        while(input != 0){
            remainder = input % 10 ;
            input = input / 10;
            count++;
        }
        return count;
    }
}
