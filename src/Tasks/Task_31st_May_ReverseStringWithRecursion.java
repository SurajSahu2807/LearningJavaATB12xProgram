package Tasks;
import java.util.Scanner;

public class Task_31st_May_ReverseStringWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = sc.nextLine();
        if(input.matches("^[A-Za-z0-9 ]+$")){
            String reversed = reverse(input);
            System.out.println("Reversed string: " + reversed);
        }else{
            System.out.println("User has entered an incorrect input . Please provide an valid String input");
        }

    }

    // Recursive function to reverse string
    static String reverse(String str) {
        // Base case: if string length is 0 or 1, just return it
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive case:
        // Take last char + reverse of remaining substring
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
