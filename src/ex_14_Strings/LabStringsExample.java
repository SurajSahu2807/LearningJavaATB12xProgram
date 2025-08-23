package ex_14_Strings;

public class LabStringsExample {
    public static void main(String[] args) {

        String s = "Java";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
        // Always keep in mind that Index starts from 0

        System.out.println(s.codePointAt(0)); //this will return the Unicode value of character present at 0th index

        // CompareToIgnoreCase(String str)
        int result = "abc".compareToIgnoreCase("ABC");
        System.out.println(result); // It will return 0 if both are equal and -1 is unequal
        // compareTo(String str)
        int result2 = "abc".compareTo("ABC");
        System.out.println(result2); // compareTo will compare the ASCII key value of the first character and return the difference


        int index = "Java".indexOf("a");
        System.out.println(index);

        int index1 = "Java".lastIndexOf("a");
        System.out.println(index1);

        boolean b = " ".isEmpty(); // false
        boolean c = "".isEmpty(); // true
        System.out.println(b);
        System.out.println(c);

        String s11 = String.join("-","java","python");
        System.out.println(s11);

        String s12 = "Java".replace("a","o");
        System.out.println(s12);

        boolean s13 = "Java".startsWith("a");
        System.out.println(s13);


    }
}
