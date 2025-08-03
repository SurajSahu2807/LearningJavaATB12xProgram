package ex_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5,6};

        // 2nd way to create an array
        int[] mark2 = new int[5];
        String mark3[] = new String[7]; // fixed size

        String[] names = new String[3]; // index --> 0,1,2
        names[0] = "Suraj";
        names[1] = "Deepak";
        names[2] = "Sanat";

        System.out.println(marks[0]);
        System.out.println(mark3[0]); // returning null for String as a default value

        System.out.println(names[2]);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println("Length :- " + names.length);

        boolean mm[] = {true,false,true};
        System.out.println(mm[0]);
        System.out.println(mm[1]);
        System.out.println(mm[2]);
    }
}
