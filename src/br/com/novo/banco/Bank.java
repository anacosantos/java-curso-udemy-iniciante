package br.com.novo.banco;

public class Bank {
	 public static void main(String[] args) {
		
		 ContaBancoNovo p1 = new ContaBancoNovo();
		 p1.setNumConta(1111);
		 p1.setDono("Jubileu");
		 p1.abrirConta("CC");
		 
		 ContaBancoNovo p2 = new ContaBancoNovo();
		 p2.setNumConta(2222);
		 p2.setDono("Creuza");
		 p2.abrirConta("CP");
		 
		 p1.depositar(300);
		 p2.depositar(500);
		 p2.sacar(100);
		 
		 p1.estadoAtual();
		 p2.estadoAtual();
	}

}
