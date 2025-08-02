package ex_14_Strings;

public class LabStringExamples2 {
    public static void main(String[] args) {

        // subSequence(int beginIndex, int endIndex) --> return the characterSequence from begin to end-1;
        CharSequence ss = "Java".subSequence(1,3);
        System.out.println(ss);
    }
}
