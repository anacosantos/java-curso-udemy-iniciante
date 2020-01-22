package br.com.exercio.uri;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
				
		for(int x = 1; x <= 10; x++ ) {
			int multiplicacao = x * N;
			System.out.println(x + " x " + N + " = " + multiplicacao);
		}
		sc.close();
	}

}
