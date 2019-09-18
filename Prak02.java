/**
 * @(#)Prak02.java
 *
 *
 * @author 
 * @version 1.00 2019/9/18
 */

import java.util.Scanner;
public class Prak02 {

  public static void main (String[] args) {
  	Scanner input = new Scanner(System.in);
	double LL, JJ;
		
		System.out.println("=====HADIAH NO 02=====");
		System.out.println("Menghitung Luas Lingkaran");
		System.out.print("Masukkan Nilai Jari-Jari: ");
		JJ=input.nextInt();
		System.out.println();
		
		LL=3.14*JJ*JJ;
		System.out.println("Hasil Dari Perhitungan Luas Lingkaran Adalah: "+LL);
	}
	
}