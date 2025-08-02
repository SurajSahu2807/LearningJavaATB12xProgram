package ex_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {

        // Mostly in Automation, We will use Normal String --> 90%
        String Name = "Pramod"; // --> Getting stored in String Constant Pool
        String s1 = new String("Pramod");

        // less than 10% used.
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}
