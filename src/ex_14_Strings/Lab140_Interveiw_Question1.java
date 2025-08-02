package ex_14_Strings;

public class Lab140_Interveiw_Question1 {
    public static void main(String[] args) {
        String s1 = "Hello"; // Created in String Constant Pool
        String s4 = "Hello";
        String s5 = "Hello";
        /*
        In SCP only one Hello will be there , and all the three s1, s4
        and s5 will be pointing to the one Hello data
         */
        String s6 = "hllo";
        // hllo will added and takes a memory in SCP

        String m1 = new String("Hello");
        String m4 = new String("Hello");
        String m3 = new String("Hello");
        /* here in object Area which is under heap there everytime
        a new Hello will be created as here we are using a new keyword
        * */

    }
}
