import java.util.Scanner;

public class XOPattern{
     public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int m = s.nextInt();
          for(int i = 1; i<=m; i++){
               for(int j=1; j<=n; j++){
                    if(((i==2 || i==m-1) && (j>=2 && j<=n-1)) || ((j==2 || j==n-1) && (i>=2 && i<=m-1))) System.out.print("X ");
                    else System.out.print("0 ");
               }
               System.out.println();
          }
     }
}
