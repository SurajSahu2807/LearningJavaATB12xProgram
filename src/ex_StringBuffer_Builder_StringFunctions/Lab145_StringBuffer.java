package ex_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
        /*
        As we know StringBuffer are mutable so Dutta will get added with Pramod
        but in this case it will not return a new String , the same String pramod
        will get modified and Dutta will get added with it.
        StringBuffer is Thread-Safe means Tasks or operations will get
        happened synchronously one after another.
        */

        String s1 = "pramod";
        s1 = s1 + "Dutta";
        System.out.println(s1);
        /*
        In this String---> mutable ; then 2 String will be there in the
        String Constant Pool
         */

    }
}
