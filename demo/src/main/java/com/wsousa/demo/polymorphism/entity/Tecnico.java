package com.wsousa.demo.polymorphism.entity;

public class Tecnico extends Funcionario{
    private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void trabalha() {
	System.out.println("rala pra caramba");
	}

}
