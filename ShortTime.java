import java.util.Scanner;

public class ShortTime{
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt(); // no.of durations
          String []duration = {"12:34:55","1:12:13", "8:12:15"};
          //String []duration = new String[n];
          //for(int i=0; i<duration.length; i++) duration[i] = scan.next();
          int []timings = new int[n];

          for(int i=0; i<duration.length; i++){
               String []time = duration[i].split(":");
               int secs = Integer.parseInt(time[0])*3600 + Integer.parseInt(time[1])*60 + Integer.parseInt(time[2]);
               timings[i] = secs;
          }
          int shorttime = 12*3600 + 59*60 + 59;
          for(int i=0; i<timings.length-1; i++){
               for(int j=i+1; j<timings.length; j++){
                    int timeDiff = Math.abs(timings[i] - timings[j]);
                    if(timeDiff < shorttime) shorttime = timeDiff;
                    System.out.print(timeDiff+" ");
               }
          }
          System.out.println();
          System.out.printf("Shortest Time is: %02d:%02d:%02d", (shorttime/3600), ((shorttime%3600)/60), ((shorttime%3600)%60));
     }
}

//System.out.print();
