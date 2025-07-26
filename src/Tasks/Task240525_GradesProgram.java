package Tasks;
import java.util.Scanner;

public class Task240525_GradesProgram {
    public static void main(String[] args){
        /*
        In switch Statement which we can able to use is byte,short,int,long,char,enums and String.
        */
        // Using the Scanner class
        Scanner scanner = new Scanner(System.in);
        // ASCII key values for A to Z characters are 65 to 90
        // ASCII key values for A to F are 65 to 71
        System.out.println("Enter a character Value from A to E");
        if(scanner.hasNextInt()){
            System.out.println("Provide an valid Input character Value ");
        }else{
            String Charinput = scanner.next().toUpperCase();
            //.Isletter();
            // This condition checks whether the first character in the input is not a letter (i.e., not A–Z or a–z).
            //If it's not a letter, the condition returns true, and your code will treat it as invalid input.
            if(Charinput.length() != 1 || !Character.isLetter(Charinput.charAt(0))){
                System.out.println("Invalid input: Please enter a single letter from A to E.");
                return;
            }
            char gradeInput = Charinput.charAt(0);
            switch(gradeInput){
                case  'A':
                    System.out.println("Excellent");
                    break;

                case 'B' :
                    System.out.println("Very Good");
                    break;

                case 'C' :
                    System.out.println("Good");
                    break;

                case 'D' :
                    System.out.println("Needs Improvement");
                    break;

                case 'E' :
                    System.out.println("Fail");
                    break;

                default:
                    System.out.println("Invalid grade");
            }
        }
    }
}
