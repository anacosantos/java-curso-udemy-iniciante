package br.com.animalzinho2;

public class Zoo2 {

	public static void main(String[] args) {
		
		Lobo l = new Lobo();
		l.emitirSom();
		
		Cachorro c = new Cachorro();
		c.emitirSom();
		//metodo polimorfismo de sobrecarga
		c.reagir("Ol�");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
		
		
		
	}

}
