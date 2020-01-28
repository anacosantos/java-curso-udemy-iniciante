package br.com.exercio.uri;

import java.util.Scanner;

public class _1074 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int x = 0; x < n; x++) {
			int z = sc.nextInt();
			if (z % 2 == 0 && z > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (z % 2 != 0 && z > 0) {
				System.out.println("ODD POSITIVE");
			} else if (z % 2 == 0 && z < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (z % 2 != 0 && z < 0) {
				System.out.println("ODD NEGATIVE");
			} else if (z == 0) {
				System.out.println("NULL");
			}
		}
		sc.close();
	}

}


