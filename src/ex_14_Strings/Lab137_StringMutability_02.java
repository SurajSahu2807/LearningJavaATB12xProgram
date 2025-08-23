package ex_14_Strings;

public class Lab137_StringMutability_02 {
    public static void main(String[] args) {
        String s1 = "Hello"; // Gets Memory in the string constant pool
        s1 = s1.concat("World");
        System.out.println(s1);
        // here two strings will be there in the string constant pool

    }
}
