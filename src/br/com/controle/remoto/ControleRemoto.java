package br.com.controle.remoto;

import java.net.Socket;

//usar o implements para implementar todos os metodos
public class ControleRemoto implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	//metodos especias 
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
		//boolean sempre vai usar isNomedoMetodo() no lugar de get, mas como estou aprendendo
		//vou continuar usando get só como uma orientação.
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	//metodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}
	@Override
	public void desligar() {
		this.setLigado(false);
		
	}
	@Override
	public void abrirMenu() {
		//fazer o abrir menu se a TV tiver ligada.
		System.out.println("-----Menu-----");
		System.out.println("Está ligado?"+this.getLigado());
		System.out.println("Está tocando?"+this.getTocando());
		System.out.print("Volume: "+this.getVolume());
		for (int i = 1; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
		System.out.println("");
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu..");
		
	}
	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+5);
		}else {
			System.out.println("Impossível aumentar volume");
		}
		
	}
	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()-5);
		}else {
			System.out.println("Impossível diminuir volume");
		}
		
	}
	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}
	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}
	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("Não consegui reproduzir");
		}
		
	}
	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não consegui pausar");
		}
		
	}
}
