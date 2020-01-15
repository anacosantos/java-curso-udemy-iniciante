package br.com.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcional {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double min = sc.nextDouble();
		
		if(min <= 100) {
			System.out.printf("Valor a pagar: %.2f%n",50.00);
		}
		else {
			double valorAMais = (min-100);
			double resultado = valorAMais * 2.00;
			
			resultado = resultado + 100; 
			
			System.out.printf("Valor a pagar: %.2f%n" ,resultado);
		}
		
			
				
		sc.close();
	}
}
