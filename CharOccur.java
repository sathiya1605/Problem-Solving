import java.util.Scanner;

public class CharOccur{
     public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          String input = s.nextLine();
          int[] arr = new int[123];
          for(int i=0; i<input.length(); i++)
               arr[input.charAt(i)]++;

          for(int i=0; i<input.length(); i++){
               int count = 0;
               for(int j=0; j<=i; j++)
                    if(input.charAt(i) == input.charAt(j))
                         count++;
               if(count == 1)
                    System.out.print(input.charAt(i)+":"+arr[input.charAt(i)]+" ");
          }
          // for(int i=0; i<input.length(); i++){
          //      System.out.print(input.charAt(i)+""+arr[input.charAt(i)]);
          // }

     }
}
