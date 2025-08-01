package ex_13_Functions;

public class Lab132_UserDefined_functions_Part1 {
    public static void main(String[] args) {
        /*
        User Defined Functions
        // 1. Without Parameters without Return Type
        // 2. Without Parameters with Return Type
        // 3. With Parameters and without Return Type
        // 4. With Parameters and With Return Type
         
         */

        // calling functions
        wp_wr_greet();
        String ValueRet = wp_with_Ret();
        System.out.println(ValueRet);
        wthp_woutRet(26);
        System.out.println(wthp_and_wthRet(3,5));

    }

    // 1. Without Parameters and Without Return Type
    static void wp_wr_greet(){
        System.out.println("Hii,How are You");
    }

    // 2. Without Parameters with Return Type
    static String wp_with_Ret(){
        return "Without Parameters with Return Type";
    }

    // 3. With Parameters and without Return Type
    static void wthp_woutRet(int age){
        System.out.println("Suraj age is : - " + age);
    }

    // 4. With parameters and with Return Type
    static int wthp_and_wthRet(int n1, int n2){
        return n1+n2;
    }


}
