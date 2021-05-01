

class InsertionSort{
     public static void main(String []args){
          int []arr = {8,3,6,5,4,1};

          // for(int i=arr.length-1; i>=0; i--){
          //      int key = arr[i];
          //      int j = i-1;
          //      while(j< arr.length-1 && arr[i] > key){
          //
          //      }
          // }
          for(int i=1; i<arr.length; i++){
               int key = arr[i];
               int j=i-1;
               while(j>=0 && arr[j] < key){
                    arr[j+1] = arr[j];
                    j--;
               }
               arr[j+1] = key;
          }

          for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
     }
}
