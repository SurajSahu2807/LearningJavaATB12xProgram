package ProgramPractice;
import java.util.Scanner;

public class Prac150725AAProg2 {
    public static void main(String[] args) {
        // Handling Case Sensitive expression in Switch Statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a required browser");
        String browser = scanner.next().toLowerCase();
        switch(browser){
            case "chrome" :
                System.out.println("Launching chrome browser");
                System.out.println("Executing TC 1");
                System.out.println("Executing TC 2");
                break;
        }
    }
}
