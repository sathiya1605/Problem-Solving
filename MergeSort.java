import java.util.Scanner;

public class MergeSort{
     public static void main(String []args){
          int []arr = {8,7,6,5,4};
          int n = arr.length;
          mergeSort(arr,0,n-1);
          for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
     }
     public static void mergeSort(int[] arr, int start, int end){
          if(start < end){
        int mid = start + (end-start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merger(arr, start, mid, end);
    }
     }
     public static void merger(int []arr, int start, int mid, int end){
          int ls = mid - start + 1;
          int rs = end - mid;
          int []larr = new int[ls];
          int []rarr = new int[rs];
          for(int i=0; i<ls; i++) larr[i] = arr[i+start];
          for(int i=0; i<rs; i++) rarr[i] = arr[mid+1+i];

          int i,j,k;
          i = j = 0;
          k = start;
          while(i < ls && j < rs){
               if(larr[i] < rarr[j]) arr[k++] = larr[i++];
               else arr[k++] = rarr[j++];
          }
          while(i < ls) arr[k++] = larr[i++];
          while(j < rs) arr[k++] = rarr[j++];
     }
}
