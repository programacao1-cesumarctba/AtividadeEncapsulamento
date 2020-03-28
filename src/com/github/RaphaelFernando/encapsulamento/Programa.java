package com.github.RaphaelFernando.encapsulamento;

import com.github.raphael.encapsulamento.Curso;

public class Programa {

	public static void main(String[] args) throws Exception {
		Curso Curso = new Curso();
		Curso.setNome("Hobito");
		Curso.setProfessor("Maycon");
		Curso.setTema("Encapsulamento");
		Curso.setValor(100);
		
		System.out.println(String.format("Nome: %s \n" +
										"Professor: %s \n" +
										"Tema: %s \n" +
										"Valor %f \n", Curso.getNome(), Curso.getProfessor(), Curso.getTema(), Curso.getValor()));
	}

}
