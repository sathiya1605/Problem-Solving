import java.util.Scanner;

public class ClockProb{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int timePeriod = s.nextInt();
          float latitude = s.nextFloat();
          float totalMins = ((timePeriod/360.0f) * latitude) * 60.0f;
          int hour = (int)totalMins/60;
          int mins = (int)totalMins%60;
          System.out.println(hour);
          System.out.println(mins);
          float angle = Math.abs((hour*5) - mins) * 3;
          if(angle >= 180) angle%=180;
          System.out.print(angle);
     }
}
