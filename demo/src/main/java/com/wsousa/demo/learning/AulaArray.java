package com.wsousa.demo.learning;

public class AulaArray {

	public static void main(String[] args) {
		 int[] tabelaDeNumeros = new int[5]; 
		 
		 for(int i = 0; i < tabelaDeNumeros.length; i++) { 
			 tabelaDeNumeros[i] = (i+1)*10;
		} 
		 for(int i = 0; i < tabelaDeNumeros.length; i++) { 
			 System.out.println(tabelaDeNumeros[i]);
		 }  
		 

	}

}
