package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("Hello");

        // == --> Comparision --> of String's reference address memory's location
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        // equals (content) --> compares the value
        System.out.println(s1.equals(s4));
        System.out.println(s4.equals(s2));
        System.out.println(s5.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s5));

        // equalsIgnoreCase --> pramod.equalsIgnoreCase("PRAMOD") --> return --> true
        // == --> check for the ref
        // = assignment the value



    }
}
