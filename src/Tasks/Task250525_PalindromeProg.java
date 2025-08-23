package Tasks;
import java.util.*;

public class Task250525_PalindromeProg {
    public static void main(String[] args) {
        /*
            Palindrome means the sequence of the Characters of a word from
            forward and backward needs to be same.
            Example :- madam ; paap ;
            Task --> Palindrome of String (chatAt())

        */

        Scanner scanner = new Scanner(System.in); // This create an scanner object which can take a user input from keyboard
        System.out.println("Enter the String Input");
        String input = scanner.nextLine().toLowerCase().replaceAll(" ", "");
        StringBuilder builder = new StringBuilder();
        if(input.matches("^[a-zA-Z ]+$")){
            for(int i = input.length() - 1 ; i >= 0 ; i-- ){
                    builder.append(input.charAt(i));
            }
            if(builder.toString().equals(input)){
                System.out.println("The Given String input is an Palindrome String");
            }else{
                System.out.println("The Given String input is not an Palindrome");
            }
        }else{
            System.out.println("Provide a valid String input (Only Alphabet Letters)");
        }
    }
}
