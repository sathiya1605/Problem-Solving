import java.util.Scanner;

public class ArrRowCol{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int [][]arr = new int[n][n];
          for(int i=0; i<arr.length; i++)
               for(int j=0; j<arr[0].length; j++)
                    arr[i][j] = s.nextInt();

          // if(min(arr) == max(arr)) System.out.print(1);
          // else System.out.print(0);
           System.out.print(min(arr));

     }
     public static int min(int [][]arr){
          int []maxArr = new int[arr.length];
          int maxVal = arr[0][0];
          for(int col = 0; col<arr.length; col++){
               maxVal = arr[0][col];
               for(int row = 0; row<arr.length; row++) if(maxVal < arr[col][row]) maxVal = arr[col][row];
               maxArr[col] = maxVal;
          }
          int minOfMax = maxArr[0];
          for(int i=1; i<maxArr.length; i++) if(minOfMax > maxArr[i]) minOfMax = maxArr[i];
          for(int i=0; i<maxArr.length; i++)  System.out.print(maxArr[i]+" ");
          return minOfMax;
     }

     public static int max(int [][]arr){
          int []minArr = new int[arr.length];
          int minVal = arr[0][0];
          for(int i=0; i<arr.length; i++){
               minVal = arr[i][0];
               for(int j=1; j<arr[i].length; j++){
                    if(minVal > arr[i][j]) minVal = arr[i][j];
               }
               minArr[i] = minVal;
          }
          int maxOfMin = minArr[0];
          for(int i=1; i<minArr.length; i++) if(maxOfMin < minArr[i]) maxOfMin = minArr[i];
          return maxOfMin;
     }
}
