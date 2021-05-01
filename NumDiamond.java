import java.util.Scanner;

public class NumDiamond{
     public static void main(String []args){
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int val = 1;
          for(int i=0; i<n; i++){
               for(int j=0; j<n-i-1; j++) System.out.print(" ");
               int num = val+i;
               for(int k = 0; k<=i; k++ ){
                    System.out.printf("%2d ",num);
                    val++;
                    num--;
               }
               System.out.println();
          }
     }
}
