package br.com.Ultraemojicombat;

public class EmojiCombat {
	public static void main(String[] args) {
		Lutador lutador[] = new Lutador[6];	
		
		lutador[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f,
								68.9f, 11, 2, 1);
		lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
				57.8f, 14, 2, 3);
		lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f,
				80.9f, 12, 2, 1);
		lutador[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93f,
				81.6f, 13, 0, 2);
		lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f,
				119.3f, 5, 4, 3);
		lutador[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f,
				105.7f, 12, 2, 4);
		
		//lutador[0].ganharLuta();
/*		lutador[0].apresentar();
		lutador[0].status();
		
		lutador[1].perderLuta();
		lutador[1].apresentar();
		lutador[1].status();
		
		lutador[2].apresentar();
		lutador[2].status();
		
		lutador[3].apresentar();
		lutador[3].status();
		
		lutador[4].apresentar();
		lutador[4].status();
		
		lutador[5].apresentar();
		lutador[5].status();*/
		// ou pode-se fazer:
		//for (Lutador lutadorItem : lutador) {
			//lutadorItem.apresentar();
			//lutadorItem.status();
			
			Luta UEC01 = new Luta();
			UEC01.marcarLuta(lutador[0], lutador[1]);
			UEC01.lutar();
			//lutador[0].status();
			//lutador[1].status();
			//UEC01.marcarLuta(lutador[1], lutador[1]);
		}
		
	//}
}
