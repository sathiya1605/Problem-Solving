import java.util.Scanner;

public class SubSqrSum{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          // int n = s.nextInt();
          // int [][]arr = new int[n][n];
          int arr[][] = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
          int k = s.nextInt();
          int sum = 0;

          for(int i=0; i<=arr.length-k; i++){
               for(int j=0; j<=arr.length-k; j++){
                    sum = 0;
                    for(int row = i; row<i+k; row++)
                         for(int col = j; col<j+k; col++)
                              sum+=arr[row][col];
                    System.out.print(sum+" ");
               }
               System.out.println();
          }

     }
}
