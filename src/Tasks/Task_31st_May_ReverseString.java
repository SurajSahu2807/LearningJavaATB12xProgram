package Tasks;
import java.util.Scanner;
public class Task_31st_May_ReverseString {
    public static void main(String[] args){
        /*
        Write a program to reverse a string without using inbuilt functions. -> forloop
        1) To findout the datatype for the required input and output

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string input");
        String input = scanner.nextLine();
        if(input.matches("^[a-zA-z0-9 ]+$")){
            StringBuffer magic = new StringBuffer();
            for(int i = input.length() - 1 ; i >= 0 ; i--){
                magic.append(input.charAt(i));
            }
            String Output = magic.toString();
            System.out.println("Reverse of user entered input is :- " + Output);
        }else{
            System.out.println("User has entered an incorrect input . Please provide an valid String input");
        }
    }
}
