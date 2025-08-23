package ProgramPractice;

import java.util.Scanner;

public class Practice_Palindrome {
    public static void main(String[] args){
            // madam ---> squence of this word is same
            // madam i'm adam
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toLowerCase().replaceAll(" ","");
            StringBuilder formattedInput = new StringBuilder();
            if(input.matches("^[a-zA-Z ]+$")){
                for(int i = input.length()-1 ; i >= 0 ; i--){
                    if(input.charAt(i) == ' '){
                        continue;
                    }
                    formattedInput.append(input.charAt(i));
                }
                if(formattedInput.toString().equals(input)){
                    System.out.println("The Given input is Palindrome");
                }else{
                    System.out.println("The Given input is not an Palindrome");
                }
            }else{
                System.out.println("Enter an valid String input( In Letters )");
            }
    }
}
