import java.util.Scanner;

class SegOddEve{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int []arr = {1,2,3,7,4,5,6,9};
          int even = 0;
          int odd = arr.length-1;

          while(even<=odd){
               while(arr[odd]%2==0) odd--;
               while(arr[even]%2!=0) even++;
               int temp = arr[even];
               arr[even] = arr[odd];
               arr[odd] = temp;
               even++; odd--;
          }

          for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
     }
}
