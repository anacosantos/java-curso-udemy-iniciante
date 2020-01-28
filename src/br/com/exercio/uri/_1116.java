package br.com.exercio.uri;

import java.util.Scanner;

public class _1116 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int pares;
		
		for(int x =0; x<=n; x++) {
			double primeiro = sc.nextDouble();
			double segundo = sc.nextDouble();
			
			if (segundo == 0) {
				System.out.println("Impossivel divisao");
			}else {
				double resultado = primeiro/segundo;
				System.out.println(resultado);
			}
		}

		sc.close();

	}

}
