package ch05;

public class Lis {
    static int a(int array[], int n) 
    { 
        int a [] = new int[n]; 
        int i, j, max = 0; 
  
        for (i = 0; i < n; i++) 
            a[i] = 1; 
  
        for (i = 1; i < n; i++) 
            for (j = 0; j < i; j++) 
                if (array[i] > arr[j] && a[i] < a[j] + 1) 
                    a[i] = a[j] + 1; 
  
        for (i = 0; i < n; i++) 
            if (max < a[i]) 
                max = a[i]; 
  
        return max; 
    } 
  
    public static void main(String args[]) 
    { 
        int array[] = { 5, 10, 15, 20, 25 };
        System.out.print("Array : ");
        for (int i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }
        int n = array.length;
        System.out.println();
        System.out.println("Length of LIS = " + a(array, n) + "\n"); 
    } 
} 