package br.com.exercicio.triangulo;

import java.util.Locale;
import java.util.Scanner;

public class idadeMedia {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		double media = (double) (idade1 + idade2) / 2;
		//double media = (idade1 + idade2) / 2.0; se eu tirar o double posso usar o ponto no final e for�o compilador por fazer por double
		System.out.printf("A idade m�dia de %s e %s � de %.1f anos", nome1, nome2, media);
		sc.close();
		
	}

}
