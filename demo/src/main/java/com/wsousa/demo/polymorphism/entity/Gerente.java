package com.wsousa.demo.polymorphism.entity;

public class Gerente extends Funcionario {
	
	public double bonificacao(double salario){
		return (salario*1.20);
	}

	@Override
	public void trabalha() {
		System.out.println("gerente trabalhando");
	}

}
