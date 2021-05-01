import java.util.*;

class RevStack{
     public static void main(String[] args) {
          Stack<Integer> stk = new Stack<>();
          stk.push(5);
          stk.push(4);
          stk.push(37);

          Stack<Integer> nst = new Stack<>();
          while(!stk.isEmpty())
               nst.push(stk.pop());

          // System.out.println(stk.peek());
          // System.out.println(stk.push(stk.pop()));
          //System.out.println(nst.isEmpty());
          Iterator i = nst.iterator();
          //while(i.hasNext()) System.out.print(i.next()+" ");
          System.out.print(m(4,9));

     }

     public static int m(int x, int y){
          if(x%2 == 1 || y%2 == 1) return 1;
          return 2 * m(x/2, y/2);
     }
}
