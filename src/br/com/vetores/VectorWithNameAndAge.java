package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class VectorWithNameAndAge {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		
		int N = sc.nextInt();
		String names [] = new String [N];
		int [] ages = new int [N];
		double [] heights = new double [N];
		
		//vector reading
		for(int x = 0; x < N; x++) {
			System.out.println("Enter name, age and height");
			names[x] = sc.next();
			ages[x] = sc.nextInt();
			heights[x] = sc.nextDouble();
		}
		
		double add = 0.0;
		for(int x = 0; x < N; x++) {
			add = add + heights[x];
		}
		
		double average = add / N;
		
		System.out.printf("Average height: %2f.%n", average);
		
		int under16 = 0;
		for(int x = 0; x < N; x++) {
			if(ages[x] < 16 ) {
				under16 = under16 + 1;
			}
		}
		double x = under16 * 100.0 / N;
		System.out.printf("People under 16: %.1f%%%n", x);
		
		
		sc.close();
	}

}
