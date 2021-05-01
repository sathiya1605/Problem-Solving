public class SubStringProg{
  public static void main(String[] args){
    String fString = "Hello from here";
    fString+=fString;
    String sString = "erHello from he";
    int count = 0;

    for(int i=0; i<=fString.length()-sString.length(); i++){
         int k=0;
         count = 0;
         while(k < sString.length() && fString.charAt(i) == sString.charAt(k)){
              if(fString.charAt(i) != sString.charAt(k)) break;
              count++;
              i++;
              k++;
         }
         if(count == sString.length()){
              System.out.print("Yes");
              return;
         }
    }
    System.out.print("No");
  }
}
