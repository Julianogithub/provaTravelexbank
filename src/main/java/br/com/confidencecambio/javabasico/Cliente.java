package br.com.confidencecambio.javabasico;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome = "João";
	private String sobrenome = "Soares Silva";
	
	public Cliente() {	
	}

	public Cliente(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Cliente:\nNome=" + nome 
			 + "\nSobrenome=" + sobrenome ;
	}

	

	

}
