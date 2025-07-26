package ProgramPractice;
import java.util.Scanner;

public class Prac01SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number from 1 to 7");
        if(sc.hasNextInt()){
            num = sc.nextInt();
            switch(num){
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;
                default :
                    System.out.println("Provide a valid input from 1 to 7");
            }
        }else{
            System.out.println("Provide a valid input | You Fool | ");
        }

    }
}
