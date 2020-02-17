package br.com.vetores;

import java.util.Scanner;

public class Exercicio2 {
	//Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário.
	//Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada
	//Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).
	//http://algoritmo.wikidot.com/exercicios2
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int tamanho = sc.nextInt();
		double notas [] = new double [tamanho];
		double soma = 0;
		double media = 0;
		double notasMenores [] = new double [tamanho];
		
		for(int x = 0; x < tamanho; x++){
			notas [x] = sc.nextDouble();
			soma = soma + notas [x];
		}
		media = soma/tamanho;
		
		System.out.println(soma);
		
		System.out.println(media);
		
		int y = 0;
		
		for(int x = 0; x < tamanho; x++) {
			if(notas [x] > media) {
				System.out.println(notas [x]);
			} else {
				
				notasMenores[y]= notas [x];
				y++;
			}
		}
		
		for(int x = 0; x < y; x++) {
			System.out.println(notasMenores[x]);
		}
		sc.close();
	
}
	
	
}
