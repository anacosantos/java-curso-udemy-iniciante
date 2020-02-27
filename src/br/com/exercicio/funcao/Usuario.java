package br.com.exercicio.funcao;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		Classe instanciaDaClasse  = new Classe();
		instanciaDaClasse.idade = idade;
		instanciaDaClasse.imprimirInt(instanciaDaClasse.calculaAnoNascimento());
		
		sc.close();
	}

}
