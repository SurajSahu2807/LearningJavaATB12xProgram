package ex_11_While;
import java.util.Scanner;
import java.util.Random;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        /* User enters a number n = 50
            if 70 > 50
            if 40 < 50
            if 50 == 50

            // Figureout the datatyp fo variables of input and output
            // Write the rough logic around this
            // Write the proper logic around this
            // optimize the code
            // cover the edge cases
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guessingNumberUser = random.nextInt(100)+1;
        System.out.println(guessingNumberUser);
        System.out.println("Enter the First User Input");
        if(scanner.hasNextInt()){
            int userInput = scanner.nextInt();
            int attempts = 1;
            while( userInput > guessingNumberUser || userInput < guessingNumberUser ){
                System.out.println("Enter an User Input");
                userInput = scanner.nextInt();
                attempts++;
                if(userInput == guessingNumberUser){
                    System.out.println("User guessed the correct guessing number i.e : " + userInput);
                    break;
                }
            }
            System.out.println("Total Number of attempts :- " + attempts);
        }else{
            System.out.println("Enter a Whole Integer Number");
        }

    }
}
