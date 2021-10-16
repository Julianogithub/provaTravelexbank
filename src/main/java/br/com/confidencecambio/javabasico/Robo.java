package br.com.confidencecambio.javabasico;

import java.io.Serializable;

public class Robo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nomeLetraMaiusculo = "JOÃO SOARES SILVA";
	private String nomeAbreviado = "João S. Silva";
	
	public Robo() {
	}

	public Robo(String nomeLetraMaiusculo, String nomeAbreviado) {
		super();
		this.nomeLetraMaiusculo = nomeLetraMaiusculo;
		this.nomeAbreviado = nomeAbreviado;
	}

	public String getNomeLetraMaiusculo() {
		return nomeLetraMaiusculo;
	}

	public void setNomeLetraMaiusculo(String nomeLetraMaiusculo) {
		this.nomeLetraMaiusculo = nomeLetraMaiusculo;
	}

	public String getNomeAbreviado() {
		return nomeAbreviado;
	}

	public void setNomeAbreviado(String nomeAbreviado) {
		this.nomeAbreviado = nomeAbreviado;
	}

	@Override
	public String toString() {
		return "Robo: \nNome letra maiusculo=" + nomeLetraMaiusculo + ""
			 + "\nNome abreviado=" + nomeAbreviado;
	}

}
