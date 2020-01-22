package br.com.exercio.uri;

import java.util.Scanner;

public class _1071 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min, max;
		
		if (x < y) {
			min = x;
			max = y;
		} else  {
			min = y;
			max = x;
		} 
		
		int soma = 0;
	    for (int z = min + 1; z < max; z++) {
	    	if(z % 2 != 0) {
	    		soma = soma + z;
	    		
	    	}
	    }
		
	    System.out.println(soma);
	    
		sc.close();
	
	}

}
