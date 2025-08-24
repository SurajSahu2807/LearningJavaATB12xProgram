package Tasks;
import java.util.Scanner;

public class Task250525_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the obtained total number in exam");
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if(number < 0 || number > 100){
                System.out.println("Entered number is invalid . Please Provide an valid input");
            }else{
                int num = number / 10;
                switch(num){
                    case 9 :
                        System.out.println("Grade Obtained in exam is : A");
                        break;
                    case 8 :
                        System.out.println("Grade Obtained in exam is : B");
                        break;
                    case 7 :
                        System.out.println("Grade Obtained in exam is : C");
                        break;
                    case 6 :
                        System.out.println("Grade Obtained in exam is : D");
                        break;
                    default :
                        System.out.println("Grade Obtained in exam is : F");
                }
            }
        }else{
            System.out.println("Entered input is invalid . Please Provide an valid input");
        }
    }
}
