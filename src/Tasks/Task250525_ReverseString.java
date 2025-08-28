package Tasks;
import java.util.Scanner;

public class Task250525_ReverseString {
    public static void main(String[] args) {
        /*
                Reverse String
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an String Input");
        String Input = scanner.nextLine();
        if(Input.matches("^[a-zA-z ]+$")){
            String Output;
            StringBuilder builder = new StringBuilder();
            for(int i = Input.length()-1 ; i >= 0; i-- ){
                builder.append(Input.charAt(i));
            }
            Output = builder.toString();
            System.out.println(Output);
        }else{
            System.out.println("The Entered Input is not an String.Please Provide an valid String input");
        }
    }
}
