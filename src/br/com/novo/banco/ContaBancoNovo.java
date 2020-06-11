package br.com.novo.banco;

public class ContaBancoNovo {
	
	private int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	/*metodo construtor criado abaixo:*/

	public ContaBancoNovo () {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public void estadoAtual() {
		System.out.println("--------------------------------");
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("tipo: "+this.tipo);
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
		System.out.println("--------------------------------");
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			//this.saldo = 50;ou faço como esta abaixo
			this.setSaldo(50);
		} else if(t == "CP"){
			//this.saldo = 150;
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fecha, pois ainda tem dinheiro");
		} else if (this.getSaldo() < 0){
			System.out.println("Conta não pode ser fechada, pois tem débito");
		} else {
			this.setStatus(false);
		}
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de "+ this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	public void sacar(float v) {
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insufuciênte para saque");
			}
		} else {
			System.out.println("impossível sacar de uma conta fechada!");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo()=="CC") {
			v=12;
		}else if(this.getTipo()=="CP") {
			v=20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
		}else {
			System.out.println("impossível pagar uma conta fechada");
		}
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}