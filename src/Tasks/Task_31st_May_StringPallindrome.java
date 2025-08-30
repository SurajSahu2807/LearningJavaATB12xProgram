package Tasks;

import java.util.Scanner;

public class Task_31st_May_StringPallindrome {
    public static void main(String[] args){
        /*
        ⚠️ String is a Palindrome
            First Letter of Each Word in a String
            Palindrome means the sequence of the Characters of a word from
            forward and backward needs to be same.
            Example :- madam ; paap ;
            Task --> Palindrome of String (chatAt())
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string input");
        String input = scanner.nextLine().replaceAll(" ","");
        if(input.matches("^[a-zA-Z0-9 ]+$")){
            StringBuffer magic = new StringBuffer();
            for(int i = input.length() - 1 ; i >= 0 ; i--){
                if(input.charAt(i) == ' '){
                    continue;
                }
                magic.append(input.charAt(i));
            }
            String Output = magic.toString();
            if(input.equalsIgnoreCase(Output)){
                System.out.println("The Entered input is an palindrome");
            }else{
                System.out.println("The Entered input is not an palindrome");
            }
        }else{
            System.out.println("User has entered an incorrect input . Please provide an valid String input");
        }

    }
}
