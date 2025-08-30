package Tasks;
import java.util.Scanner;

public class Task_31st_May_CountNumberOfWords {
    public static void main(String[] args) {
        //Count the Number of Words in a String (replaceAll)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an String input");
        String input = scanner.nextLine();
        if(input.matches("^[A-Za-z0-9 ]+$")){
            String[] arr = input.split(" ");
            System.out.println("Total Number of Words :- " + arr.length);
        }else{
            System.out.println("User has entered an incorrect input . Please provide an valid String input");
        }
    }
}
