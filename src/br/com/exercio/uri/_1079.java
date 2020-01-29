package br.com.exercio.uri;

import java.util.Scanner;

public class _1079 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int x = 0; x < n; x++) {

		    double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			double media = nota1 * 2 + nota2 * 3 + nota3 * 5 / 10;
			System.out.println(media);

		}

		sc.close();

	}

}
