package com.github.raphael.encapsulamento;

public class Curso {

	private String Nome;
	private String Professor;
	private String Tema;
	private double Valor;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getProfessor() {
		return Professor;
	}
	public void setProfessor(String professor) {
		Professor = professor;
	}
	public String getTema() {
		return Tema;
	}
	public void setTema(String tema) {
		Tema = tema;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) throws Exception {
		if(valor == 0 || valor > 1000 || valor < 0 ) {
			this.Valor = valor;
		}else {
			throw new Exception("Valor invalido");
		}
		Valor = valor;
	}

}
