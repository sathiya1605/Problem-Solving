import java.util.Scanner;

public class RevWordsRecursion{
     //int i = 0;
     public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          String str = s.nextLine();

          String finalStr = "";
          String tempStr = "";

          for(int i=0; i<str.length(); i++){
               char ch = str.charAt(i);

               if(ch != ' ') tempStr = tempStr + ch;
               else{
                    finalStr = " "+tempStr+finalStr;
                    tempStr = "";
               }
          }
          finalStr = tempStr + finalStr;
          System.out.print(finalStr);
     }
}
