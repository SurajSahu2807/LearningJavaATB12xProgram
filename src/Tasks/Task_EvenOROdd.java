package Tasks;

import java.util.Scanner;

public class Task_EvenOROdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("The given number : " + num + " is " + ( num%2 == 0 ? "Even" : "Odd") );
    }
}
