package ex_14_Strings;

public class Lab135_String_Mutable {
    public static void main(String[] args) {
        // Strings are immutable
        String name = "Pramod"; // In String Constant Pool
        name.toUpperCase();
        System.out.println(name); // PRAMOD--> No it will not return this
        // Always keep in mind that the String is immutable
        // PRAMOD this will also takes a memory in string constant pool
    }
}
