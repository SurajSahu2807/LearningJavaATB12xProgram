package ProgramPractice;

public class InterviewQuestionPrac_ReverseOfString {
    public static void main(String[] args) {

        String input = "Pramod";
        StringBuilder sb = new StringBuilder();
        for(int i=input.length()-1; i>=0;i--){
            sb.append(input.charAt(i));
        }
        System.out.println(sb);
    }
}
