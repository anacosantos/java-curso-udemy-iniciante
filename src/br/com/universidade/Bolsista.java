package br.com.universidade;

public class Bolsista extends Aluno{
	
	private float bolsa;
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	public void RenovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}
	@Override
	public void pagarMensalidade () {
		System.out.println(this.nome + " é bolsista");
	}
}
