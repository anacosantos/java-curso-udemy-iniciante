package br.com.exercicio.para;

import java.util.Scanner;

//crie um programa exiba o seguinte menu ao usuario: 

// Digite uma opção - 1 - Saque, 2 - Deposito, 3 - Depositos de Cheques

//Quando o usaurio ditigar a opcção 1 o sistema deve fazer: 
//Solicitar ao usuario digitar o numero da conta
//O sistema deve ler o numero da conta. Apos isso o sistema deve solicitar o valor:
//Solicitar ao usuario digitar o valor a ser depositado 
//O sistema deve ler o valor digitado.
//Se o valor digitado for menor ou igual a 0 o sistema deve avisar que o valor é invalido
//Se o valor for maior que zero, o sistema deve somar o valor em uma variavel saldo.

//Quando o usuario informar a opcao 2 o sistema deve fazer: 
//Solicitar ao usuario digitar o valor a ser sacado
//O sistema deve verificar se o valor a ser sacado, menos o valor da varialvel saldo: Caso a diferenca seja maior que zero efetuar o saque, caso seja menor informar : saldo insuficiente

//Quando o usuario infomar a opcao 3 o sistema deve fazer: 
//Solicitar quantos cheques o usuario deseja infomar 
//O sistema deve ler os numeros dos cheques de acordo com a quantidade informada acima
//Quando chegar ao fim da leitura dos valores dos cheques o sistema deve mostrar todos os cheques lidos e pedir para o usuario confimar
//Se o usuario digitar 'Sim' o sistema soma o valor no valor saldo.
//Caso 'Nao' o sistema deve sair. 


public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Digite uma opção: \n 1 - Saque \n 2 - Deposito \n 3 - Depositos de Cheques");
		
		int x = sc.nextInt();
		double saldo = 500;
		double soma = 0;
		
		
		
		if(x == 1) {
			System.out.println("Digite o número da conta:");
			String numDaConta = sc.next();
			System.out.println("Digite o valor a ser depositado:");
			double valorDepositado = sc.nextDouble();
			if (valorDepositado <= 0) {
				System.out.println("Valor inválido");
			} else {
				saldo = saldo + valorDepositado;
				System.out.println("Valor depositado com sucesso! Saldo: " + saldo);
			}
		}
		if(x == 2 ) {
			System.out.println("Digitar valor a ser sacado:");
			double saque = sc.nextDouble();
			if(saque < saldo) {
				System.out.println("Saque");
				saldo = saldo - saque;
				System.out.println("Saldo: " + saldo);
			} else {
				System.out.println("Saldo insuficiênte");
			}
		}
		if(x == 3) {
			System.out.println("Depósito de cheques");
			System.out.println("Quantas folhas desejas depositar?");
			int folhas =sc.nextInt();
			double valordoCheque = 0;
			for(int z = 1; z <= folhas; z++) {
				System.out.println(z);
				System.out.println("digite o valor do cheque");
				valordoCheque = sc.nextDouble();
				soma = soma + valordoCheque;
				
			} 
			
			System.out.println("Total digitado: " +  soma + " Confirma?");
			String confirmacao = sc.next();
			if(confirmacao.equals("sim")) {
				saldo = saldo + soma;
				System.out.println("Seu saldo é: " + saldo);
			}
		}
		
		sc.close();
		}
		
}
