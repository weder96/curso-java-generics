package com.wsousa.demo.pr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Poc02 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(Poc02.sum(lista));
		System.out.println(Poc02.sumInteger(lista));
		
		List<Integer> bigs = Arrays.asList(100,200,300);
		assert Poc02.sumInteger(bigs) == Poc02.sum(bigs);
		assert Poc02.sumInteger(bigs) != Poc02.sumInteger(bigs); //not recomendado
		assert Poc02.sumInteger(bigs).equals(Poc02.sumInteger(bigs));
		assert Poc02.sumInteger(bigs) != Poc02.sumIntegerIterator(bigs);
	}

	
	public static int sum (List<Integer> ints) { 
		int s = 0;
			for (int n : ints) { 
			s += n; 
			}
		return s;
	}
	
	public static Integer sumInteger (List<Integer> ints) { 
		Integer s = 0;
			for (Integer n : ints) { 
			s += n; 
			}
		return s;
	}
	
	public static Integer sumIntegerIterator (List<Integer> ints) { 
		Integer s = 0;
		for (Iterator<Integer> it = ints.iterator(); it.hasNext(); ) { 
			int n = it.next();
		     s += n;
		}
		return s;
	}
	
	
	
	
}