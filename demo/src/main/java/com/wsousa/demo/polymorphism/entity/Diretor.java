package com.wsousa.demo.polymorphism.entity;

public class Diretor extends Funcionario{
	
	public double bonificacao(double salario){
		return (salario*1.40);
	}

	@Override
	public void trabalha() {
		System.out.println("Diretor trabalhando");
	}

}
