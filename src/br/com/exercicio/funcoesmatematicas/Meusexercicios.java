package br.com.exercicio.funcoesmatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Meusexercicios {

	public static void main(String[] args) {
		
//		double metroquadrado = 300.00;
//		double preco = 60000.00	;
//		
//		System.out.printf("O valor do metro quadrado é: " + "%.2f%n", preco);
//		Locale.setDefault(Locale.US);
//		System.out.printf("O metro quadrado é: " + "%.2f%n", metroquadrado);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
		
	}
}
//•DEGUGGGGGGGGGG: Para marcar uma linha de breakpoint:
//• Run -> Toggle Breakpoint
//• Para iniciar o debug:
//• Botão direito na classe -> Debug as -> Java Application
//• Para executar uma linha:
//• F6
//• Para interromper o debug: apertar quadrado vermelho na janela