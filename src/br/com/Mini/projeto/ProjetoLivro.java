package br.com.Mini.projeto;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa [] p = new Pessoa [2];
		Livro [] l = new Livro[3];
		
		p[0] = new Pessoa("Marcus", 35, "M");
		p[1] = new Pessoa("Ana", 34, "F"); 
		
		l[0] = new Livro("Te amo!", "Aninha Autora", 300, p[0]);
		l[1] = new Livro("Eu mesma.", "Anita Autora", 300, p[1]);
		l[2] = new Livro("DO it!", "Aninhazinha Autora", 300, p[0]);
		
		l[0].abrir();
		l[0].folhear(200);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());

	}

}
