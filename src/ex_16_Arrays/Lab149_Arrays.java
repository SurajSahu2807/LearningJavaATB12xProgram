package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {

        int a = 10;
        int[] marks = { 91,90,51,100,91,92,89 };
        boolean[] is_Married_people = { true, false ,true };

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
//        System.out.println(marks[-1]); // Return ArrayIndexOutOfBound Exception
//        System.out.println(marks[10]); // Returns ArrayIndexOutOfBound Exception

        char c = 'A';
        String name = "pramod";
        String[] name_each_Element_char = name.split("");
        System.out.println(name_each_Element_char.length);
        // ["p","r","a","m","o","d"]




    }
}
