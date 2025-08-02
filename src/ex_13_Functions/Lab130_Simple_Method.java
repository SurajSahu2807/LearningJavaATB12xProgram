package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_Return_Type_function();
        int returnedNumber = return_Type_function();
        System.out.println("Returned Number :- " + returnedNumber);
    }

    /*
    There are two types of functions
    Return_Type and Non_Return_Type
     */

    // Defining Non_Returning_Type_Function
    // No Return type fucntion does not return anything
    static void non_Return_Type_function(){
        System.out.println("Hii, Non-Return Type");
    }

    // Return type function will return a particular data
    static int return_Type_function(){
        System.out.println("Hii , Return Type Function");
        return 10;
    }

}
