package ex_17_OOPs;

public class Lab160 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student --> class loading
        // s1 --> Object reference
        // new Student() --> Object Creation

    }

}

// Here we can't write it below class with public as in code only one public class is allowed
class Student {
        String name;
        int roll;

        void sleep(){};
}
