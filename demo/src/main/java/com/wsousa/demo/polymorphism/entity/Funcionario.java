package com.wsousa.demo.polymorphism.entity;

public abstract class Funcionario {
    private String nome;
	 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void trabalha();
	
	public double bonificacao(double salario){
		return (salario*1.10);
	}
}
