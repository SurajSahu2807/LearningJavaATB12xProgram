package Tasks;
import java.util.*;

public class Task250525_CountVowelsAndConsonants {
    public static void main(String[] args) {
        // Count Vowels and Consonants in a string
        // Vowels --> a , e , i , o , u
        int vowelCount = 0;
        int consonantCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        if(input.matches("^[a-zA-Z ]+$")){
            input = input.toLowerCase();
            for( char ch : input.toCharArray() ){
                if("aeiou".indexOf(ch) != -1){
                    vowelCount++;
                }else if( ch != ' '){
                    consonantCount++;
                }
            }
        }else{
            System.out.println("Enter a valid String input");
        }
        System.out.println("Vowels :- " + vowelCount);
        System.out.println("Consonent :- " + consonantCount);
    }
}

/* My Logic
//            String[] arr = input.split("");
//            for(int i = 0;i < arr.length ; i++ ){
//                if(arr[i].equalsIgnoreCase("a") ||
//                        arr[i].equalsIgnoreCase("e") ||
//                        arr[i].equalsIgnoreCase("i") ||
//                        arr[i].equalsIgnoreCase("o") ||
//                        arr[i].equalsIgnoreCase("u") ){
//                    vowelCount++;
//                    continue;
//                }else if(arr[i].equalsIgnoreCase(" ")){
//                    continue;
//                }else{
//                    consonantCount++;
//                }
//            }


 */
