import java.util.Scanner;

class MulThread implements Runnable{
     public void run(){
          System.out.print("run");
     }
     public static void main(String[] args) throws NullPointerException{
          try{
               Scanner s = new Scanner(System.in);
               int age = s.nextInt();
               System.gc();
               if(age<18){
                    age = age / 0;
               }
               // Runnable m = new MulThread();
               // Thread t = new Thread(m);
               // t.start();
          }
          catch(Exception e){
               System.out.print(e.toString());
               //e.toString();
          }

     }
}



/*
     Idhayam inaivatharku inayam thevai illai..
*/
