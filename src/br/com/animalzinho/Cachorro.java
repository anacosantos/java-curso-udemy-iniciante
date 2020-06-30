package br.com.animalzinho;

public class Cachorro extends Mamifero{
	
	public void enterraOsso() {
		System.out.println("Enterrando o osso");
	}
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}
	@Override
	public void emitirSom() {
		System.out.println("AU AU AU");
	}
		
}
