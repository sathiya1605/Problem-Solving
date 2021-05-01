import java.util.Scanner;

class RevBySpace{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          String str = "abcd efgh ijkl";

          for(int i=0; i<str.length(); i++){
               if(i == str.length()-1){
                    for(int k=i; str.charAt(k)!= ' '; k--) System.out.print(str.charAt(k));
               }
               else if(str.charAt(i) == ' '){
                    for(int k=i-1; k>=0; k--){
                         if(str.charAt(k) == ' ') break;
                         System.out.print(str.charAt(k));
                    }
                    System.out.print(" ");
               }
               //System.out.print(i);
          }
     }
}
