package ex_13_Functions;

public class Lab_131_User_Defined_Functions {
    public static void main(String[] args) {
        int sum = sum_Of_Two_Numbers(4,5);
        System.out.println(sum);
    }

    // static returnType functionName( datatype parameters , datatype parameters){
    // }
    static int sum_Of_Two_Numbers(int n1 , int n2){
        return n1 + n2;
    }



}
 