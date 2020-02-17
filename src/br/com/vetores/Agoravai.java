package br.com.vetores;

import java.util.Scanner;

public class Agoravai {

	// Bem vindo ao nosso sistema de lista de casamento.
	// Voce deve criar um sistema que gerencie a lista de casamento.
	// Para isso o sistema deve primeiro saber o numero de convidados. Apos isso o
	// sistema deve solicitar ao usuario para digitar
	// O nome de todos os convidados.
	// Após o sistema deve imprimir os convidados informados.
	// Apos isso o sistema deve fazer a funcionalidade de confirmação de convidados
	// para o casamento.
	// Para isso o sistema deve imprimir cada convidado e solicitar que o usuario
	// confirme se este convidado vai ou nao.
	// Por exemplo: o sistema deve imprimir
	// "Para o convidado Marcus, ele vai no casamento ?"
	// E o usuario deve digitar sim ou nao
	// O sistema deve guardar todas as pessoas que confirmaram a presença no
	// casamento.
	// No final do programa o sistema deve imprimir a lista de todas as pessoas
	// confirmadas
	// E tambem no final deve imprimir o total de pessoas confirmadas no casamento.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo a lista de casamento Carol e Quiquito");
		System.out.println("Digite o número de pessoas a serem convidadas.");
		
		int N = sc.nextInt();
		String [] nomesDosConvidados = new String[N];
		String[] convidadosConfirmados = new String[N];
		
		for(int x=0; x<N; x++) {
			nomesDosConvidados [x] = sc.next();
		}
		
		//numero de convidados é tamanho do array
		int numeroConvidados = sc.nextInt();
		String[] nomes = new String[numeroConvidados]; //para inicializar array passa o tamanho que o pc vai reservar o espaço p mim
				
		
		for(int x = 0; x < numeroConvidados; x++) {
			nomes[x] = sc.next();
		}
		
		System.out.println(nomes[0]);
		
		for(int x = 0; x <numeroConvidados ; x++) {
			System.out.println(nomes[x]);
			
		}
		
		sc.close();
				
		
	}

}
