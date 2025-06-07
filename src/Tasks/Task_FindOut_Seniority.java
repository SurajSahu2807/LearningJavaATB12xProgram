package Tasks;

import java.util.Scanner;

public class Task_FindOut_Seniority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("As per the given age you are : " +
                (age > 18 ? ( age > 65 ? "Senior" : "Adult") : "Minor"));
    }
}
