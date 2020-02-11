package br.com.vetores;

import java.util.Scanner;

public class ListaCasamento {

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

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao nosso sistema de lista de casamento: Ana Carolina e Marcus Vinícius");

		System.out.println("Digite o número de pessoas a serem convidadas.");

		int N = sc.nextInt();
		String[] nomeconvidados = new String[N];
		String[] convidadosConfirmados = new String[N];

		System.out.println("Agora digite nome do convidado: ");
		for (int x = 0; x < N; x++) {
			nomeconvidados[x] = sc.next();
		}

		System.out.println("A lista digitada foi: ");
		for (int x = 0; x < nomeconvidados.length; x++) {
			System.out.println(nomeconvidados[x]);
		}

		int soma = 0;
		// funcionalidade de confirmacao do convidado.
		for (int x = 0; x < nomeconvidados.length; x++) {
			System.out.println("Para o convidado " + nomeconvidados[x] + ", ele vai no casamento ?");
			String confirmacao = sc.next();
			if (confirmacao.equals("sim")) {
				System.out.println("sim");
				convidadosConfirmados[x] = nomeconvidados[x];
				soma = soma + 1;

			}

		}

		
		for (int x = 0; x < convidadosConfirmados.length; x++) {
			if(convidadosConfirmados[x] != null) {
				System.out.println(convidadosConfirmados[x]);
				
			}
			
		}
		
		System.out.println("O total de convidados confirmados foi: " + soma);
		
		sc.close();

	}
}
