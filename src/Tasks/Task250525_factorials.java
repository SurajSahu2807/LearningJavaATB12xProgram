package Tasks;
import java.math.BigInteger;
import java.util.Scanner;
public class Task250525_factorials {
    public static void main(String[] args){
        /*
        Return the Factorial of the given input number
        5! = 1 * 2 * 3 * 4 * 5
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an input value whose factorial sum user wants");
        if(scanner.hasNextInt()){
            int Input = scanner.nextInt();
            if(Input < 0){
                System.out.println("Factorial is only defined for non-negative integers");
                System.out.println("Enter an valid positive input value");
            }else if(Input == 0){
                System.out.println("Factorial of " + Input + " is : 1");
            }else if( Input > 20 ){
                BigInteger Fact = BigInteger.ONE; // BigInteger can store numbers of unlimited size.
                /*
                You can’t assign Fact = 1 directly, because 1 is an int, not a BigInteger.
                BigInteger.ONE is a constant object that represents the number 1.
                */
                /*
                BigInteger.valueOf(i) converts the primitive int value into a BigInteger.
                Example: BigInteger.valueOf(5) → BigInteger object with value 5.
                .multiply() is the method used for multiplication, since you can’t use * with BigInteger.
                 */
                for(int i = 1 ; i <= Input; i++){
                    Fact = Fact.multiply(BigInteger.valueOf(i));
                }
                System.out.println("Factorial of " + Input + " is : " + Fact);
            }else{
                long Fact = 1;
                for(int i = Input ; i >= 1 ; i--){
                    Fact *= i;
                }
                System.out.println("Factorial of " + Input + " is : " + Fact);

            }
        }else{
            System.out.println("Enter an valid integer input value");
        }
    }
}
