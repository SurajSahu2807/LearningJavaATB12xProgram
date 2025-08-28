package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab146_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("123");
        System.out.println(stringBuilder);
        /*
        StringBuilder class is not ThreadSafe as the tasks or operations
        will get executed in an unsynchronous way
         */


    }
}
