import java.util.*;

public class StringProg{
     public static void main(String []args){
          Scanner s = new Scanner(System.in);
          // String input = s.nextLine();
          // String []list = input.split(" ", 0);
          // for(String i: list) System.out.println(i);
          HashMap<Integer,Integer> h = new HashMap<>();
          int []a = {1,5,1,2,3,4};
          for(int i=0; i<a.length; i++){
               h.put(a[i],i);
          }
          System.out.println(h);

     }
}
