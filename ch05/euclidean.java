package ch05;

public class euclidean {
    public static int fpb(int a, int b) 
    { 
        if (a == 0) 
            return b; 
  
        return fpb(b % a, a); 
    } 
    public static void main(String[] args) 
    { 
        int a = 10;
        int b = 5, c; 
        c = fpb(a, b); 
        System.out.println("FPB dari (" + a + ", " + b + ") = " + c); 
    
    }
}

