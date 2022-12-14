package com.wsousa.demo.learning;

public class AulaArray04 {

	public static void main(String[] args) {
		 int[][] tabelaDeNumeros = new int[5][]; 
		    for(int i = 0; i < tabelaDeNumeros.length; i++) { 
		    	tabelaDeNumeros[i] = new int[3];  
		    } 
		    
		    for(int i = 0; i < tabelaDeNumeros.length; i++) { 
		    	for(int j = 0; j < tabelaDeNumeros[i].length; j++) { 
		    		tabelaDeNumeros[i][j] = i*j;  
		    		System.out.printf("%d - ",tabelaDeNumeros[i][j]);
		    	} 
		    	System.out.println("");
		    }


	}

}
