import java.util.Scanner;

public class ColTraversal{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int [][]arr = new int[n][n];
          for(int i=0; i<arr.length; i++)
               for(int j=0; j<arr[0].length; j++)
                    arr[i][j] = s.nextInt();

          for(int col = 0; col<arr.length; col++){
               for(int row = arr.length-1; row>=0; row--)
                    System.out.print(arr[row][col]+" ");
               System.out.println();
          }

     }
}
