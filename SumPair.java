import java.util.Scanner;
import java.util.*;
import java.util.Set;

class SumPair{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int key = s.nextInt();
          int []arr = {1,-3,-5,15,4,6};
          Set<Integer> set = new HashSet<>();
          for(int i=0; i<arr.length; i++){
               if(set.contains(key/arr[i])) System.out.println("("+arr[i]+","+(key/arr[i])+")");
               //System.out.print(set.add(arr[i])+" ");
               else set.add(arr[i]);
          }
          //System.out.print(set);
     }
}
