package Tasks;
import java.util.Scanner;

public class Task_SwichHackerRankProgram {

    /* Write a Java program that takes a month number (1-12) and prints the number of days
    in that month using a switch statement. Handle February separately for leap years.

    a year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.
    Input -> 1 to 12, and Year = 2025
    -> 1 and year 2025 -> 31 Days
    -> 2 and year 2025 -> 28 Days, ( 2025 leap)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number");
        int monthNumber = 1;
        int Year = 2017;
        if(scanner.hasNextInt()){
            monthNumber = scanner.nextInt();
            switch(monthNumber){
                case 1 :
                    System.out.println("January month is having total 31 days");
                    break;
                case 2 :
                    if(Year % 4 == 0 || ( Year % 400 == 0 && Year % 100 != 0)){
                        System.out.println("Febuary month is having total 29 days");
                        break;
                    } else{
                        System.out.println("Febuary month is having total 28 days");
                        break;
                    }
                case 3 :
                    System.out.println("March month is having total 31 days");
                    break;
                case 4 :
                    System.out.println("April month is having total 30 days");
                    break;
                case 5 :
                    System.out.println("May month is having total 31 days");
                    break;
                case 6 :
                    System.out.println("June month is having total 30 days");
                    break;
                case 7 :
                    System.out.println("July month is having total 31 days");
                    break;
                case 8 :
                    System.out.println("August month is having total 31 days");
                    break;
                case 9 :
                    System.out.println("September month is having total 30 days");
                    break;
                case 10 :
                    System.out.println("October month is having total 31 days");
                    break;
                case 11 :
                    System.out.println("November month is having total 30 days");
                    break;
                case 12 :
                    System.out.println("December month is having total 31 days");
                    break;
                default :
                    System.out.println("Enter a valid Month number | You Fool | ");
            }
        }else{
            System.out.println("Don't provide a input other than integer value | You Fool |");
        }
    }




}
