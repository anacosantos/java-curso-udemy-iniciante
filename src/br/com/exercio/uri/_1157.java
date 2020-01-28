package br.com.exercio.uri;

import java.util.Scanner;

public class _1157 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDigitado = sc.nextInt();
		
		for(int i = 1; i <=numeroDigitado; i++) {
			if(numeroDigitado % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
