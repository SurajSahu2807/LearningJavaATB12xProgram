package ex_11_While;

public class Lab115_While {
    public static void main(String[] args) {
        // First Step is Initilization and it will be outside
        int i = 0;
        while( i <= 10 ){ // condition must be true to enter into the loop
            System.out.println(i);
            i++; // updation
        }


        // Initialization ; Condition ; Updation
        for( i = 0; i < 10 ; i++ ){
            System.out.println(i);
        }
    }
}
