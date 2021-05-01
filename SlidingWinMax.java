import java.util.Scanner;
import java.util.*;

class SlidingWinMax{
     static ArrayList<Integer> a = new ArrayList<>();
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int k = s.nextInt();
          int []arr = {1,1,5,2,6,2,4,8,9};
          for(int i = 0; i<=arr.length-k; i++){
               int max = arr[i];
               for(int j=i; j<i+k; j++){
                    if(max < arr[j]) max = arr[j];
               }
               System.out.print(max+" ");
               a.add(1);
          }
     }
}
