
/*
Given an array arr[] and size of array is n and one another key x, and give you a segment size k. The task is to find that the key x present in every segment of size k in arr[].
Examples:

    Input :
    arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3}
    x = 3
    k = 3
    Output : Yes
    There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.
    Input :
    arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25}
    x = 23
    k = 5
    Output :Yes
    There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}.
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9}
x = 8 
k = 2
Output : No

*/
public class KeyCheckInArr{
     public static void main(String []args){
          int []arr = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12};
          int key = 3;
          int x = 3;

          Boolean flag = false;
          for(int i=0; i<arr.length; i+=x){
               flag = false;
               for(int j=i; j<i+x && j<arr.length; j++){
                    if(arr[j] == key){
                         flag = true;
                         break;
                    }
               }
               if(flag) continue;
               else{
                    System.out.println("No");
                    return;
               }
          }
          if(flag) System.out.print("Yes");
     }
}
