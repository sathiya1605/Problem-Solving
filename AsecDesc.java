import java.util.Scanner;

public class AsecDesc{
     public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          int []arr = {1,2,3,4,5,6};
          // 7,1,6,2,5,3,4
          int mid = arr.length/2;
          int rytArrSize = mid;
          int lftArrSize = arr.length - mid;
          //int []rytArr = new int[rytArrSize];
          int []lftArr = new int[lftArrSize];
          for(int i=0, j=arr.length-1; j >= mid; j--){
               lftArr[i] = arr[j];
               i++;
          }
          for(int i=1, j=0, k=0; i<= arr.length; i++){
               if(i%2==0){
                    System.out.print(arr[j]+" ");
                    j++;
               }
               else{
                    System.out.print(lftArr[k]+" ");
                    k++;
               }
          }
     }
}

//System.out.print();
