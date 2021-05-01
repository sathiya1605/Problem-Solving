import java.util.Scanner;

public class Palindrome{
     public static void main(String []args){
          Scanner s = new Scanner(System.in);
          String word = s.nextLine();

          int start = 0;
          int end = word.length()-1;
          Boolean flag = true;
          while(start<=end){
               if(word.charAt(start)!=word.charAt(end)){
                    flag = false;
                    break;
               }
               ++start;
               --end;
          }
          if(flag) System.out.print("Pali");
          else System.out.print("Not");
     }
}
