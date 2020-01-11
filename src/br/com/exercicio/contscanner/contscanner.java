package br.com.exercicio.contscanner;

import java.util.Scanner;

public class contscanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		//foi usado este nextline(quebra de linha) a mais para nao consumir a proxima linha, assim, a proxima esta sendo o string
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
		
	}
}
	
	