import java.util.Scanner;

public class ATMDenom{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int []denoms = {2000,500,200,100};
          System.out.print("Enter amount in multiples of 100: ");
          int amt = s.nextInt();
          //System.out.println();
          int highDenom = 100;
          int i = 0;
          for(; i<denoms.length; i++){
               if(amt > denoms[i]){
                    highDenom = denoms[i];
                    break;
               }
          }
          int tempAmt = amt;
          if(tempAmt >= 2800){
               System.out.println(2000+":"+tempAmt/2000);
               tempAmt%=2000;
          }
          if(tempAmt >= 800){
               if(tempAmt%500 < 300){
                    System.out.println(500+":"+(tempAmt/500 - (tempAmt%500)/500));
                    tempAmt+=(tempAmt%500)/500;
               }
               else{
                    System.out.println(500+":"+tempAmt/500);
                    tempAmt%=500;
               }
          }
          if(tempAmt < 100){
               if(tempAmt%200 == 0){
                    System.out.println(200+":"+(tempAmt/200 - (tempAmt%200)/200));
                    tempAmt+=(tempAmt%200)/200;
               }
               else{
                    System.out.println(200+":"+tempAmt/200);
                    tempAmt%=200;
               }
          }
          System.out.println(100+":"+tempAmt/100);

     }
}
