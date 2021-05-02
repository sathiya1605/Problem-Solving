/*

i/p : 1234   o/p: one thousand two hundred and thirty four
i/p:  11     o/p: eleven

*/

import java.util.Scanner;

public class NumToWord{
     public static void main(String []args){
          Scanner s = new Scanner(System.in);
          String num = s.next();

          String []ones = {"one","two","three","four","five","six","seven","eight","nine", "ten"};
          String []tens = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
          String []elevens = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen", "twenty"};

          int number = Integer.parseInt(num), remainder;

          if(number >= 1000 && number<= 9999){
               System.out.print(ones[number/1000 - 1]+" thousand ");
               number%=1000;
          }
          if(number >= 100 && number<=999){
               System.out.print(ones[number/100 - 1]+" hundred and ");
               number%=100;
          }
          if(number >= 10 && number <= 99){
               if(number%10 == 0){
                    System.out.print(tens[number/10 - 1]);
                    return;
               }
               else if(number >= 11 && number <= 19){
                    System.out.print(elevens[number-11]+" ");
                    return;
               }
               else if(number%10!=0 && number>=21 && number<=99 ) System.out.print(tens[number/10 -1]+" ");
               number%=10;
          }
          if(number >= 0 && number <=9){
               if(number == 0) System.out.print("zero");
               else System.out.print(ones[number-1]);
          }

     }
}

