/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String virus = s.nextLine();
        int n = s.nextInt();
        String []samples = new String[n];
        for(int k=0; k<samples.length; k++){
             samples[k] = s.nextLine();
             System.out.println(samples[k]);
        }
        for(int k=0; k<samples.length; k++){
             String sample = samples[k];
             int j=0;
             for(int i=0; i<virus.length() && j<sample.length(); i++){
                  if(virus.charAt(i) == sample.charAt(j))
                       j++;
             }
             //if(j == sample.length()) System.out.println("POSITIVE");
             //else System.out.println("NEGATIVE");
        }
   }
}
