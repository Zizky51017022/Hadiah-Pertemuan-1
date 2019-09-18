/**
 * @(#)Prak01.java
 *
 *
 * @author 
 * @version 1.00 2019/9/18
 */

import java.util.Scanner;
public class Prak01 {

    public static void main (String[] args) {
    	
    Scanner input = new Scanner(System.in);
	double CS,FH;
	int N;
		
	System.out.println("=========Menu=========");
	System.out.println("1.Celsius ke Fahrenheit");
	System.out.println("2.Fahrenheit ke Celsius");
	System.out.print("Input Pilihan: ");
			
	N=input.nextInt();
	System.out.println();
		
	switch(N){
	case 1:{
		System.out.println("=====Celsius ke Fahrenheit=====");
		System.out.print("Inputkan Nilai Celsius: ");
		CS=input.nextInt();
		FH=(CS*9/5)+32;
		System.out.print("Hasil Mengkonversi: "+FH+" Fahrenheit");
		System.out.println();
			break;}
	case 2:{
	System.out.println("=====Fahrenheit ke Celsius=====");
	System.out.print("Inputkan Nilai Fahrenheit: ");
	FH=input.nextInt();
	CS=(FH-32)*5/9;
	System.out.print("Hasil Menkonversi: "+CS+" Celsius");
	System.out.println();
	break;}
		}
    }
}
	
 