package br.com.vetores;

import java.util.Scanner;

public class Exercicio4 {
	//Leia um conjunto de salários, sendo que para terminar a entrada será
	//fornecido o valor.
	//Após toda a entrada ter sido realizada, leia o valor de um reajuste.
	//Em seguida exiba todos os salários já reajustados.
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		double salario [] = new double [N];
		double reajuste [] = new double [N];
		double reajustados = 0;
		
		for(int x = 0; x < N; x++) {
			salario [x] = sc.nextDouble();
			reajuste [x] = sc.nextDouble();
			reajustados = salario[x] + reajuste[x];
			System.out.println(reajustados);
		}
		
		sc.close();
		
	}
}
