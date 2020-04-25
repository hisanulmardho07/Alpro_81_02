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
public class n {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<nilai.length;i++){
    	   System.out.print(nilai[i]+" ");
        }
	
	System.out.println();
	System.out.println();
	
	int jumlah = 0;
	for (int i=0;i<nilai.length;i++){
	   for(int array:nilai){
	      if(nilai[i]<nilai.length){
	      jumlah=nilai.length-nilai[i];
	      }
	   }
    	System.out.println("Jumlah angka sebelum "+nilai[i]+" = "+jumlah);
        }
    }
}
