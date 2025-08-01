package ex_10_For_Loop;

public class Lab108_greather_vs_equal {
    public static void main(String[] args) {
        for(int i = 0 ; i < 50 ; i++){
            // it will print the value from 0 to 49
            System.out.print(i + ",");
        }
        System.out.println();
        for(int i = 0 ; i <= 50 ; i++){
            // it will print the value from 0 to 50 ; 51 times interation
            System.out.print(i + ",");
        }
        System.out.println();
        for(int i = 50 ; i >= 0 ; i--){
            // it will print the value from 0 to 49
            System.out.print(i + ",");
        }
    }
}
