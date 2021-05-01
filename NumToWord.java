import java.util.Scanner;

public class NumToWord{
     public static void main(String []args){
          Scanner s = new Scanner(System.in);
          String num = s.next();

          String []ones = {"one","two","three","four","five","six","seven","eight","nine", "ten"};
          String []tens = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
          String []elevens = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen", "twenty"};
          //String []hundreds = {};

          int number = Integer.parseInt(num), remainder;

          if(num.length()==1){
               if(number == 0) System.out.print("zero");
               else System.out.print(ones[number-1]);
               return;
          }
          if(num.length() == 2){
               if(number%10 == 0) System.out.print(tens[number/10 - 1]);
               else if(number >= 11 && number <= 19) System.out.print(elevens[number-11]);
               else if(number%10!=0 && number>=21 && number<=99 ){
                    System.out.print(tens[number/10 -1]+" ");
                    System.out.print(ones[number%10 -1]);
                    return;
               }
               return;
          }
          if(num.length()==3){
               if(number%100 == 0) System.out.print(ones[number/100]+" hundred");
               else if(number%100 >=1 && number%100 <=10){
                    System.out.print(ones[number/100 - 1]+" hundred and ");
                    System.out.print(ones[(number%100) - 1]);
               }
               else if(number%100 >=11 && number%100 <=20){
                    System.out.print(ones[number/100 - 1]+" hundred and ");
                    System.out.print(elevens[(number%100)-10 - 1]);
               }
               else if(number%10 == 0){
                    System.out.print(ones[number/100 - 1]+" hundred and ");
                    System.out.print(tens[(number%100)/10 - 1]);
               }
               else if(number>=121 && number<=999){
                    System.out.print(ones[number/100 - 1]+" hundred and ");
                    System.out.print(tens[(number%100)/10 - 1]+" ");
                    System.out.print(ones[(number%100)%10 - 1]);
               }
          }
     }
}

//System.out.print();
