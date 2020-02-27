package br.com.exercicio.funcao;

public class Classe {
	static String nome;
	static int idade;

	
	public static void imprimir() {
		System.out.println(nome);	
	}
	
	public static int calculaAnoNascimento() {
		
		return 2020 - idade;
		
	}
	
	public static void imprimirInt(int valorParaImprimir) {
		System.out.println(valorParaImprimir);
	}
}


//Classe eh composta de: 
//Atributos - Variaveis
//Metodos - funcao 