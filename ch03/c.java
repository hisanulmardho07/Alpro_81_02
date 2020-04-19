package ch03;
import java.util.Scanner;
public class c {
	Run|Debug
    public static void main(String[] args) {
    	Scanner input = new Scanner {System.in};
    	int a = 0;
    	int b = 2;
    	System.out.println("menentukan bilangan pembagi terkecil");
    	System,out,print("masukkan angka : ");
    	a=input.nextInt();

    	System.out.println("---------------------------------------");

    	while (b<=a) {
    		if ( (a%b)!=0){

    		}else{
    			System.out.println("pembagi bilangan terkecil = " + b);
    			b=b+1;
    		}
    	}
    	}
}