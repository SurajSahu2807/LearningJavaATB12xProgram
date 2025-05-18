package ex_02_Java_Basics_Part2;

public class Lab025_Constants {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        /*
        Local Variable values are not assign by JVM  we know that the default value of int variable is
        0 but here the variable is local variable and JVM not assign the default value to it.
        The remaining type of variable JVM will assign the value i.e, Static Variable and Instance Variable
        The question was, what is the difference between final and constant? Actually, it should be,
        if constant is something that cannot be changed. So, if you want to make something constant,
        you have to use the final keyword.
         */

        final int b = 99;
//        b = 11; java: cannot assign a value to final variable b
        System.out.println(b);
    }
}
