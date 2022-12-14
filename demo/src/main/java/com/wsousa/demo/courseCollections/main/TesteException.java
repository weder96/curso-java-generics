package com.wsousa.demo.courseCollections.main;

public class TesteException {

	public static void main(String[] args) {
		try{
			int x = 2/0;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		 new Throwable();   
		}finally{
			System.out.println("vou ser executado de qualquer jeito");
		}
	}

}
