package Tasks;

public class Task250525_ReverseTheNumber {
    public static void main(String[] args){
        String number = "12345";
        for(int i = number.length()-1 ; i >= 0 ; i--){
            System.out.print(number.charAt(i));
        }
    }
}
