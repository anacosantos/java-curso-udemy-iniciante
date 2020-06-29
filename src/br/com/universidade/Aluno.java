package br.com.universidade;

public class Aluno extends Pessoa{
	
	private int matricula;
	private String curso;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void pagarMensalidade() {
		String tipo = this.getSexo().toLowerCase().equals("m")?"o":"a";
		System.out.println("Pagando mensalidade d" + tipo + " alun" + tipo + " "+ this.nome);
	}
}
