/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class PrimeGame {
    public static void main(String args[] ) throws Exception {
        primeGame();
   }
   public static void primeGame(){
       int n, l, r;
    	Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i=0; i<n; i++){
            String input = s.nextLine();
            l = (int)input.charAt(0);
            r = (int)input.charAt(input.length()-1);
            if(l == r) System.out.println(0);

        }
   }
}
