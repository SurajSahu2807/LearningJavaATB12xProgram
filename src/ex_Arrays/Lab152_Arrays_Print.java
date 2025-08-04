package ex_Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {

        int[] marks = { 51 , 100 , 91 , 87 , 90 };
        System.out.println(marks.length);

        System.out.println("------------");
        for( int i = 0 ; i < marks.length ; i++ ){
            System.out.println(marks[i]);
        }

        System.out.println("------------");
        System.out.println("Enhanced forloop");

        for(int mark : marks){
            System.out.println("Enhanced forLoop :- " + mark);
        }



    }
}
