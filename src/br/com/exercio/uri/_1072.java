package br.com.exercio.uri;

import java.util.Scanner;

public class _1072 {

	 public static void main(String[] args) {
		
		 //Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		 //Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es.
		// A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica o n�mero de casos de teste.
		// Cada caso de teste a seguir � um valor inteiro X (-107 < X <107).
		 
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int x = 10; x <= 20; x++) {
			System.out.println(x);
		}

		sc.close();
	}
}
