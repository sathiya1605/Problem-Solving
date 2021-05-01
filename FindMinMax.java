

class FindMinMax{
     public static void main(String []args){
          int []arr = {6,8,1,3,4,45,7};
          int i = 0;
          int minInd = 0, maxInd = 0;
          for(; i<arr.length-1; i++){
               minInd = i;
               //maxInd = i;
               //if(arr[i] < arr[i+1]) maxInd = i;
               if(arr[i] < arr[i+1]) minInd = i;
          }
          //for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
          System.out.println(arr[minInd]);
          //System.out.println(arr[maxInd]);

     }

     public static void swap(int []arr,int a, int b){
          int temp = arr[a];
          arr[a] = arr[b];
          arr[b] = arr[a];
     }
}
