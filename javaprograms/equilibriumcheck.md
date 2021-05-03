# Java Programs

### Problem 1

#### Given an array. Find an equilibrium point. If it does not exists return -1.
> i/p: 8 5 8 11 6 4 3 6 2   -------->  o/p: 3 (Index no.)

> i/p: 9 2 5 4   ------->  o/p: 1

> i/p: 9 2 5 7   ------->  o/p: -1

### Solution

```java
class EquilibriumCheck{
     public static void main(String[] args) {
          int []arr = {9,2,5,7};    // {8,5,8,11,6,4,3,6,2};
          int leftSum = 0, rightSum = 0;
          for(int i=0; i<arr.length; i++) rightSum+=arr[i];

          boolean flag = true;
          for(int i=0; i<arr.length; i++){
               if(leftSum == rightSum-arr[i]){
                    System.out.print(i);
                    flag = false;
                    break;
               }
               leftSum+=arr[i];
               rightSum-=arr[i];
          }
          if(flag) System.out.print(-1);
     }
}
```
