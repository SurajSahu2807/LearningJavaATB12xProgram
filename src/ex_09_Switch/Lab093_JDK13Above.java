package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        int itemcode = 001;
        switch(itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
        }
    }
}
