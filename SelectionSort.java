

public class SelectionSort{
     public static void main(String []args){
          int []arr = {6,4,7,8,2,1};

          //InsertionSort
          for(int i=1; i<arr.length; i++){
               int key = arr[i];
               int j=i-1;
               for(;j>=0 && arr[j] > key; j--)
                    arr[j+1] = arr[j];
               arr[j+1] = key;
          }

          //BubbleSort
          // for(int i=0; i<arr.length-1; i++){
          //      Boolean flag = true;
          //      for(int j=0; j<arr.length-1-i; j++){
          //           if(arr[j] > arr[j+1]){
          //                flag = false;
          //                int temp = arr[j];
          //                arr[j] = arr[j+1];
          //                arr[j+1] = temp;
          //           }
          //      }
          //      if(flag) break;
          // }

          //SelectionSort
          // for(int i=0; i<2; i++){
          //      int minInd = i;
          //      for(int j=i+1; j<arr.length; j++){
          //           if(arr[minInd] > arr[j])
          //                minInd = j;
          //      }
          //      int temp = arr[i];
          //      arr[i] = arr[minInd];
          //      arr[minInd] = temp;
          // }



          for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
     }
}
