package ex_14_Strings;

public class Lab142_String_Functions {
    public static void main(String[] args) {
        // String s1 = "Hello";
        // String s2 = new String("world");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); // compares the reference location
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3)); // compares the values

        System.out.println(str1.concat(str3)); // takes memory in SCP
    }
}
