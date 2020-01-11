package br.com.exercio.uri;

import java.util.Scanner;

import java.util.Locale;

public class _1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		double C, X;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextDouble();
		
		
		System.out.println("NUMBER = " + A);
		System.out.printf("SALARY = U$ "+ "%.2f%n", B * C);
		
		sc.close();
		
	}
	
}
