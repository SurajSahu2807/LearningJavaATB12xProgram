package ex_17_OOPs;

public class LabConstructoreTheory {
    String name;

    LabConstructoreTheory(){
        System.out.println("Default Constructor with no return type");
        System.out.println("Hi, Shona");
        name  = "Shona";
    }
    LabConstructoreTheory(String n){
        System.out.println("Parameterized constructors");
    }

    public static void main(String[] args) {
        /*
           Constructor is a special method which is invoked automatically
           at the time of object creation.
           It is also used to initialize the data members (attributes) of new objects generally.
           Constructor has the same name as class or structure.
           Constructors don't have a return type
           Constructor is only called once at the time of object creation
         */
         /*
            Types of Constructors
            1) Default constructors
            2) Parameterized constructors
         */


    }
}
