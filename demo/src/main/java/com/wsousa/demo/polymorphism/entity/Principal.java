package com.wsousa.demo.polymorphism.entity;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Funcionario func = new Gerente();
		System.out.println(func.bonificacao(2000));
		
		Funcionario func1 = new Diretor();
		func1.getNome();
		System.out.println(func1.bonificacao(2000));
		
		Funcionario func2 = new Tecnico();
		System.out.println(func2.bonificacao(1000));
	}

}
