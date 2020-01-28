package br.com.exercio.uri;

import java.util.Scanner;

public class _1067 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int z = 1; z <= 1000; z++)
			if (z % 2 != 0) {
				System.out.println(z);
			}

		sc.close();

	}

}
