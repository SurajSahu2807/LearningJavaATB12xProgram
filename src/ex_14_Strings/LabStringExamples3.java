package ex_14_Strings;

public class LabStringExamples3 {
    public static void main(String[] args) {

        // subString(int beginIndex); --> don't count beginIndex as 0,1,2 instead of this
        // count in this way --> (1) J (2) a ---> remaining "va" is a substring of Java
        String ss = "Java".substring(2);
        System.out.println(ss);

        // toCharArray()  --> return character Array of String
        char[] aa = "Java".toCharArray();
        System.out.println(aa); // 'J','a','v','a'

        // trim() --> removes the leading and trailing spaces
        String s2 = "  Adam  ".trim();
        System.out.println(s2);


        // repeat(totalIteration count)
        String s4 = "ab".repeat(3);
        System.out.println(s4);

        // isBlank() --> returns boolean value
        boolean b = "   ".isBlank();
        System.out.println(b);

        // .equalIgnoreCase(String);
        boolean s5 = "Java".equalsIgnoreCase("JAVA");
        System.out.println(s5);

        // .format() %s--> String ; %d --> int
        String s7 = String.format( "%s = %d" ,"age",34);
        System.out.println(s7);

        long count  = "a\nb\nc".lines().count();
        System.out.println(count);

    }
}
