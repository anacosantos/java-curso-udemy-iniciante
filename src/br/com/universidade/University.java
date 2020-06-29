package br.com.universidade;

public class University {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		v1.setNome("Marcus");
		v1.setIdade(35);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Ana");
		a1.setMatricula(1111);
		a1.setCurso("Info");
		a1.setIdade(34);
		a1.setSexo("F");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista ();
		b1.setMatricula(1112);
		b1.setNome("Kito");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
	}

}
