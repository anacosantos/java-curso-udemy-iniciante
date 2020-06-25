package br.com.colegio;

public class ProjetoPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();

		p1.setNome("Marcus");
		p1.setIdade(35);
		p1.setSexo("M");
		
		p2.setNome("Ana");
		p2.setIdade(34);
		p2.setSexo("F");
		p2.setCurso("Info");
		p2.setMatricula(2020);
		
		p3.setNome("Lip");
		p3.setIdade(37);
		p3.setSalario(2500.75f);
		
		p4.setNome("Pedro");
		p4.setIdade(39);
		p4.setSetor("estoque");
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}

}
