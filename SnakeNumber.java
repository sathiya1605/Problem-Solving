import java.util.Scanner;

public class SnakeNumber{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int num = 1;
    Boolean flag = true;
    for(int i = 1; i<= n; i++){
         for(int j=1; j <= n-i; j++) System.out.print("  ");
         for(int j = 1; j <= n && flag ; j++){
              System.out.printf("%2d ",num);
              num++;
         }
         int rev = num+n-1;
         for(int j = rev; j>=num-n && !flag; j--){
              System.out.printf("%2d ",j);
              rev--;
              num++;
         }
         flag = !flag;
         System.out.println();
    }
  }
}
