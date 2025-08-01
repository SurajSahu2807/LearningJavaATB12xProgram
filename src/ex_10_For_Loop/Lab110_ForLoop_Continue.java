package ex_10_For_Loop;

public class Lab110_ForLoop_Continue {
    public static void main(String[] args) {
        for(int i = 0 ; i < 50 ; i++){
            // it will print the value from 0 to 49 ; and iterate 50 times
            if( i == 5 ){
                continue; // It means skip
            }
            System.out.print(i + ",");
        }
    }
}
