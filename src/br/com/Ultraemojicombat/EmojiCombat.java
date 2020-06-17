package br.com.Ultraemojicombat;

public class EmojiCombat {
	public static void main(String[] args) {
		Lutador l = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l.apresentar();
		l.status();
	}
}
