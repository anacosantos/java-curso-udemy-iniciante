package br.com.animalzinho2;

public class Cachorro extends Lobo{

	@Override
	public void emitirSom() {
		System.out.println("AU AU AU");
	}
	public void reagir(String frase) {
		/*if (frase == "toma comida" || frase == "Olá") {
			System.out.println("Abanar e latir");
		} else {
			System.out.println("Rosnar");
		}*/
		//OU FAZER O IF ABAIXO
		System.out.println(frase.equals("toma comida")|| frase.equals("Olá")?"Abanar e latir":"Rosnar");
	}
	public void reagir(int hora, int minuto) {
		if (hora<12) {
			System.out.println("Abanar");
		} else if (hora>=18){
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e latir");
		}
	}
	public void reagir(boolean dono) {
		if (dono== true) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e latir");
		}
	}
	public void reagir(int idade, float peso) {
		if (idade<5) {
			if(peso<10) {
				System.out.println("Abanar");
			} else {
				System.out.println("latir");
			}
		} else {
				if (peso<10) {
					System.out.println("Rosnar");
				} else {
			System.out.println("Ignorar");
				}
		}	
	}
		
}