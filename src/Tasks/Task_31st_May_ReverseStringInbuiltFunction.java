package Tasks;

import java.util.Scanner;

public class Task_31st_May_ReverseStringInbuiltFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string input");
        String input = scanner.nextLine();
        if(input.matches("^[a-zA-z0-9 ]+$")){
            StringBuffer magic = new StringBuffer(input);
            magic.reverse();
            String Output = magic.toString();
            System.out.println("Reverse of user entered input is :- " + Output);
//            for(int i = input.length() - 1 ; i >= 0 ; i--){
//                magic.append(input.charAt(i));
//            }

        }else{
            System.out.println("User has entered an incorrect input . Please provide an valid String input");
        }
    }
}
