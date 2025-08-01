package ex_12_DoWhile;

public class Lab125_DoWhile {
    public static void main(String[] args) {
        // The Only difference in the do while loop is
        // even the condition is false the code will get executed one time
        int a = 1; // Initialization
        do{
            System.out.println("This is the body , It will execute 1 time");
            System.out.println(a);
            a++; // updation (block of code)
        }while( a > 10 ); // condition
    }
}
