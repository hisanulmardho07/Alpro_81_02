package ch05;

public class kadane {
    public int kandaneForMaxSubArray(int[] array) {
        int maxEndHere = 0;
        int maxSoFar = 0;
        for (int i = 0; i < array.length; i++) {
         maxEndHere += arr[i];
         if (maxEndHere < 0) {
          maxEndHere = 0;
         }
         if (maxSoFar < maxEndHere) {
          maxSoFar = maxEndHere;
         }
        }
        return maxSoFar;
       }  
       public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5, -6, -7, -8 };
        System.out.print("Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        kadane maxSum = new kadane();
        System.out.println();
        System.out.println("Nilai maximum subarray =  " + maxSum.kandaneForMaxSubArray(array));
       }
}