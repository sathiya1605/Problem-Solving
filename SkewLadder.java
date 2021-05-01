import java.util.Scanner;

class SkewLadder{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();

          int k=1;
          for(int i=1; i<= n*2 - 1; i++){
               if(i<n){
                    for(int l=1; l<i; l++) System.out.print(" ");
                    System.out.print(k);
                    k++;
               }
               if(i==n){
                    int j = k;
                    while(j+n-1 > i-1){
                         System.out.print(j+n-1);
                         --j;
                         ++k;
                    }
               }
               if(i>n){
                    for(int l=1; l<i%n; l++) System.out.print(" ");
                    System.out.print(" "+k);
                    k++;
               }
               System.out.println();
          }
     }
}
