import java.util.*;

class CamelCase{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          String inp = s.nextLine();

          Character []arr = {'!','@', '#', '$', '%', '*', '-', ' '};
          HashSet<Character> delim = new HashSet<>(Arrays.asList(arr));

          for(int i=0; i<inp.length(); i++){
               if(i==0 || !(delim.contains(inp.charAt(i)) && i+1 < inp.length())){
                    if(inp.charAt(i)>=65 && inp.charAt(i) <= 90) System.out.print((char)(inp.charAt(i)+32));
                    else System.out.print(inp.charAt(i));
               }
               else{
                    while(delim.contains(inp.charAt(i))) i++;
                    if(inp.charAt(i) >= 97 && inp.charAt(i)<= 122) System.out.print((char)(inp.charAt(i)-32));
                    else System.out.print(inp.charAt(i));
               }
          }
     }
}

// Alternative method..

// for(int i=0; i<inp.length(); i++){
//      if(i==0 || !(delim.contains(inp.charAt(i)) && i+1 < inp.length())){
//           if(inp.charAt(i)>=65 && inp.charAt(i) <= 90) System.out.print((char)(inp.charAt(i)+32));
//           else System.out.print(inp.charAt(i));
//      }
//      else{
//           if(delim.contains(inp.charAt(i)) && i+1 < inp.length()){
//                i++;
//                if(inp.charAt(i) >= 97 && inp.charAt(i)<= 122) System.out.print((char)(inp.charAt(i)-32));
//                else System.out.print(inp.charAt(i));
//           }
//           else{
//                if(inp.charAt(i) >= 65 && inp.charAt(i)<= 90) System.out.print((char)(inp.charAt(i)+32));
//                else System.out.print(inp.charAt(i));
//           }
//      }
// }
