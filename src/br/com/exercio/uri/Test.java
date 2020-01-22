package br.com.exercio.uri;

import java.util.Scanner;

public class Test {

	//usuario vai digitar um numero uma unica vez, o programa deve ler esse numero maior q 5 e imprimir o numero anterior a esse até chegar ao numero 5. 
	//se chegar ao numero cinco o programa deve imprimir "Voce chegou ao cinco" e nao imprimir mais nenhum numero e sair.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*int x = 0;
		x = sc.nextInt();
		*/
		/*while (x != 5) {
			
			x = x - 1;
			
			System.out.println(x);
			
			if (x == 5) {
				System.out.println("Voce chegou ao cinco");
			}
		}*/
		
		/*for(int variavel = 0; variavel <=28;varialvel====)
		
		int varialve = 0
		while(varivel != 28) {
			variavel ++;
		}*/
		
		for(int x = sc.nextInt();x >= 5;x--) {
			System.out.println(x);
			
			if (x == 5) {
				System.out.println("Voce chegou ao cinco");
			}
		}
			
		sc.close();
	}
	
}
