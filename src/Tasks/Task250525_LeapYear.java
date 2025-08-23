package Tasks;
import java.util.Scanner;

public class Task250525_LeapYear {
    public static void main(String[] args){
        /* What is Leap Year
      --> Year which is divisible by 4
          Century years are leap year which is divisble by 400

         */

        Scanner scanner = new Scanner(System.in);
        long Year ;
        System.out.println("Enter an Year");
        if(scanner.hasNextLong()){
            Year = scanner.nextLong();
            if( Year <= 0 ){
                System.out.println("Valid Year Value is greater than 0");
            } else if(Year % 400 == 0){
                System.out.println("The Entered Century Year is an Leap Year");
            }else if( Year % 4 == 0 && Year % 100 != 0){
                System.out.println("The Entered Year is an Leap Year");
            }else{
                System.out.println("The Entered Year is not an Leap Year");
            }
        }else{
            System.out.println("Please Enter an Valid Year");
        }





    }
}
