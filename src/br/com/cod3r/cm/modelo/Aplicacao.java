package br.com.cod3r.cm.modelo;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		tabuleiro.abrir(4, 3);
		tabuleiro.alternarMarcacao(4, 6);
		
		System.out.println(tabuleiro);
	}
}
