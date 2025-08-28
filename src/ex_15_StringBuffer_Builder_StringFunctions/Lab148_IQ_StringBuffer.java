package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_IQ_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16);
        sb.append("suraj");
        sb.replace(0,4,"C++"); // need to focus
        System.out.println(sb);
    }
}
