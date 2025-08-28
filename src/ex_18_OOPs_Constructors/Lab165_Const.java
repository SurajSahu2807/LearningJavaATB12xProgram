package ex_18_OOPs_Constructors;

public class Lab165_Const {
    public static void main(String[] args) {
        Car2 tesla = new Car2(); // default constructor
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car2 nano = new Car2("nano",2023);
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}
