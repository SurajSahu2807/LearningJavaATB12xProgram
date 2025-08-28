package ex_16_Arrays;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
        /*
        int[] numbers = { 1,2,3,4,5 }
                        { 5,4, , 2,1 }
        int num = numbers[i]
        int temp = numbers[numbers.length - 5];



            if( number.length % 2 != 0 ){                                         // i = 5 ; 5 > 0
            int num = numbers[number.length-i];       // num = numbers[0] = 1
            numbers[numbers.length-i] = numbers[i-1]; // numbers[0] = numbers[4] = 5
            numbers[i-1] = num;
            }                                        // numbers[i-1] = num
        }

        // i=4 ; 4>0
        // num = numbers[1] = 2;
        // numbers[1] = numbers[3] = 4;
        // numbers[3] = num2

         */
        int[] numbers = { 1,2,3,4,5,6,7,8 };
        for(int i = numbers.length ; i >= ( numbers.length / 2) + 1   ; i-- ){
                int num = numbers[numbers.length - i];
                numbers[numbers.length - i] = numbers[i - 1];
                numbers[i - 1] = num;
    }
      for(int number : numbers){
          System.out.print(number);
      }


    }
}
