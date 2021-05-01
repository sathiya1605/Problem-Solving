import java.util.Scanner;

public class StringDecode{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    for(int i=0; i< input.length(); i++){
      if(input.charAt(i)>=48 && input.charAt(i)<=57){
        if(i+1 < input.length() && input.charAt(i+1)>=48 && input.charAt(i+1)<=57 )
          for(int j=0; j< (input.charAt(i)-48)*10 + input.charAt(i+1); j++) System.out.print(input.charAt(i-1));
        else
          for(int j=0; j< input.charAt(i)-48; j++) System.out.print(input.charAt(i-1));
      }
    }






    /*
    Solution - 1
    char[] inputArray = input.toCharArray();
    for(int i = 0; i<inputArray.length; i++){
      if(inputArray[i]>=48 && inputArray[i]<=57){
        if( i+1 < inputArray.length && (inputArray[i+1]>=48 && inputArray[i+1]<=57)){
          for(int j=0; j< (inputArray[i]-48)*10 + inputArray[i+1]-48; j++) System.out.print(inputArray[i-1]);
        }
        else{
          for(int j=0; j<inputArray[i]-48; j++) System.out.print(inputArray[i-1]);
        }
      }
    }
    */

  }
}
