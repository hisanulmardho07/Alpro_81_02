/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author Fitria Novitasari
 */
public class f {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.println("Menampilkan semua nilai array : ");

	for (int i=0;i<nilai.length;i++){
	   System.out.print(nilai[i]+" ");  
        }
	System.out.println("\n");

	System.out.print("Hanya angka ganjil yang di apit genap : ");
	for (int i=0;i<nilai.length;i++){
	   if (nilai[i]%2==0){
	       }else{ 
	         System.out.print(nilai[i]+" , ");
	    
	   }
	}
    }
}
