package ProgramPractice;
import java.util.Scanner;

public class Practice_CountsVowelsAndConsonents {
    public static void main(String[] args){
        //Counts Vowels and Consonents in a String
        int vowel_Count = 0;
        int consonents_Count = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        if(input.matches("^[a-zA-Z ]+$")){
            for(char ch : input.toCharArray()){
                if( "aeiou".indexOf(ch) != -1 ){
                    vowel_Count++;
                }else if(ch != ' '){
                    consonents_Count++;
                }
            }
        }else{
            System.out.println("Enter a Valid input(Only letters)");
        }
        System.out.println("Vowels Count :- " + vowel_Count);
        System.out.println("Consonents Count :- " + consonents_Count);
    }
}
