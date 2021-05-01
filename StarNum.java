import java.util.Scanner;

class StarNum{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();

          for(int i=1; i<=n; i++){
               for(int j=1; j<=n-i; j++) System.out.print(" ");
               for(int j=i; j>=1; j--) System.out.print("*");
               System.out.print(" ");
               for(int j=i; j<=i*2-1; j++) System.out.print(j);
               System.out.println();
          }
          for(int i=n; i>=1; i--){
               int m=n;
               for(int j=1; j<=n-i; j++) System.out.print(" ");
               for(int j=n; j>n-i; j--) System.out.print(m--);
               System.out.print(" ");
               for(int j=1; j<=i*2-1; j+=2) System.out.print(j);
               System.out.println();
          }
     }
}
