package Tasks;

import java.util.Scanner;

public class Task_MaxBwn_ThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for num1 , num2 and num3");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Maximum number out of three is : " +
                (num1 > num2 ? ( num1 > num3 ? num1 : num3 ) : (num2 > num3 ? num2 : num3 )));

    }
}
