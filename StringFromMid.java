import java.util.Scanner;

public class StringFromMid{
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          String s = scan.next();

          for(int i=0; i< s.length(); i++){
               for(int j=0; j<s.length()-i-1; j++) System.out.print("  ");
               int j = s.length()/2;
               for(; j<=s.length()/2 + i && j <s.length(); j++){
                    System.out.print(s.charAt(j));
               }
               if(j == s.length()){
                    for(int k=0;k<i-s.length()/2; k++) System.out.print(s.charAt(k));
               }
               System.out.println();
          }
     }
}
