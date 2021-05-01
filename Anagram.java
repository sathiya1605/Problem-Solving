import java.util.Scanner;

public class Anagram{
     public static void main(String []args){
          Scanner s = new Scanner(System.in);
          String s1 = s.nextLine().toLowerCase();
          String s2 = s.nextLine().toLowerCase();

          if(s1.length()!=s2.length()){
               System.out.print("Not ana");
               return;
          }

          int []s1Arr = new int[26];
          int []s2Arr = new int[26];

          for(int i=0; i<s1.length(); i++){
               s1Arr[s1.charAt(i)-97]++;
               s2Arr[s2.charAt(i)-97]++;
          }
          
          for(int i=0; i<s1Arr.length; i++){
               if(s1Arr[i]!=s2Arr[i]){
                    System.out.print("Not anaa");
                    return;
               }
          }
          System.out.print("Anagram");

     }
}
