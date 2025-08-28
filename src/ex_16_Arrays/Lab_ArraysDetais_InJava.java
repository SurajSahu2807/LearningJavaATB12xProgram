package ex_16_Arrays;

public class Lab_ArraysDetais_InJava {
    public static void main(String[] args) {

        /*
        An Array is a data structure that stores a fixed sequential collection
        of elements of the same data-type.

        Why Array Matters ??
        1) Used for data-driven testing
        2) Helps in looping through test data
        3) Useful in validating multiple inputs/outputs
        4) common in interview questions

        Declaring and Initialization of Arrays

        // Declaration
        int[] declare; --> datatype of collection of elements[] ArrayName;

        //Initialization --> Giving size to Array
        declare = new int[7]; // default values are 0

        // Declaration + Initialization
        int[] declare = {1,3,4,5,7];

        // Accessing array elements
        System.out.println(declare[0]); // output :- 1
        declare[1] = 9; // updating the value

        // Iterating through Arrays
        2 types :-
        1) for loop
        for( int i=0 ; i < declare.length ; i++ ){
            System.out.println(declare[i]);
        }

        2) Enhanced for loop
        for( int e : declare){
            System.out.println(e);
        }

        // Multi-dimensional arrays
        String[][] arr = {
            {"admin","admin123"},
            {"user","user123"}
        }
        System.out.println(arr[0][0]); // ---> output will be --> admin

        // Array Interview Questions for QA/SDET

        1. What is the default value of an array element in Java ??
        Ans --> for int = 0 ; for boolean = false ; and for Object = null;

        2. Can u change the size of an array after creation??
        Ans --> No , Array are fixed size . Use ArrayList for dynamic sizing.

        3. how do you sort an array ??
        Ans --> Arrays.sort(ArrayName);



        */







    }
}
