package br.com.estruturacondicional;

import java.util.Calendar;
import java.util.Scanner;

public class Saque {
		
	//Crie uma main para o usuario infomar o ano de nascimento, o sistema deve calcular a idade do usuario e imprimir a sua classificacao e sua idade: 
	//menor de 3 anos - bebe
	//maior que 3 e menor que 10 - Pre adolescente 
	//maior que 10 e menor de 18 anos - Adolscente 
	//maior que 18 e menor de 25 anos - Adulto 
	//maior que 25 e menor de 60 anos - Madureza 
	//Se maior que 60 o sistema deve pedir o para que o usuario digite o seu estado civil, caso o estado civil seja: 
	//solteiro - imprimir - voce pode sacar seu dinheiro
	//casado - favor digitar a idade da sua mulher: caso a idade da mulher for maior que 40, imprimir voce precisa da sua mulher, caso seja menor imprimir - voce pode sacar o seu credito 
	//vivudo - imporimir - voce pode sacar seu dinheiro
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		int nasc = sc.nextInt();
		int idade = anoAtual - nasc;
		System.out.println("Idade: "+ idade );
		
		if(idade < 3) {
			System.out.println("Bebê");
		} else {
			if (idade > 4 && idade <=10) {
				System.out.println("Pré-Adolescente");
			} else if (idade > 10 && idade <=18) {
				System.out.println("Adolescente");
			} else if (idade > 18 && idade <=25) {
				System.out.println("Adulto");
			} else if (idade > 25 && idade<=60) {
				System.out.println("Madureza");
			} else if (idade > 60) {
				System.out.println("Digite seu estado civil: ");
				String estadoCivil = sc.next();
				System.out.println(estadoCivil);
				if (estadoCivil.equals("solteiro")  ) {
					System.out.println("Você pode sacar seu dinheiro");
				} else if (estadoCivil.equals("casado")) {
					System.out.println("Favor digitar a idade da sua mulher: ");
					int idadeMulher = sc.nextInt();
					if (idadeMulher > 40) {
						System.out.println("Você precisa da sua mulher");
					} else if(idadeMulher < 40) {
						System.out.println("Você pode sacar seu crédito");
					}
				} else if (estadoCivil.equals("viuvo")) {
					System.out.println("Você pode sacar seu dinheiro");
				}
			}
				
		}
		
		sc.close();
		
	}
	
	
}
