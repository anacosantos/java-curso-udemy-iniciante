package br.com.exercicio.scanner;

import java.util.Scanner;

import java.util.Locale;

public class Scanner_aula {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
//		
//		String x;
//		x = sc.next();
//		System.out.println("Voc� digitou: " + x );
		
		
	    //ler palavra a partir do teclado
		//usado para encerrar o metodo
		//sc.close();
		
		
//		int x;
//		x = sc.nextInt();
//		System.out.println("Voc� digitou: " + x);
//		
//		sc.close();
        
//       double x;
//     
//       x = sc.nextDouble();
//        
//        //System.out.println("Voc� digitou: " + x);
//        System.out.printf("Voc� digitou: %.2f%n", x);
//        
//        sc.close();		

//        char x;
//        x = sc.next().charAt(0);
//        System.out.println("Voc� digitou: " + x);
        
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        sc.close();
        
        
	}

}
