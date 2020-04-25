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
public class h {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<nilai.length;i++){
    	   System.out.print(nilai[i]+" ");
        }
	
	System.out.println();
    	System.out.print("Jumlah angka dalam array : "+nilai.length);

	System.out.println();
	
	int jumlah = 0;
	for (int angka : nilai){
	   jumlah = jumlah+angka;
	}
    	System.out.print("Penjumlahan atas semua angka : "+jumlah);
    }
}
