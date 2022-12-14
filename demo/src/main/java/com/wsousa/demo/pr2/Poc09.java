package com.wsousa.demo.pr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poc09 {

	public static void main(String[] args) {
		List<Object> objs = Arrays.<Object>asList("one", 2, 3.14, 4); 
		Poc09.reverse(objs);
		System.out.println(objs);
		
		List<Integer> ints = Arrays.<Integer>asList(2, 314, 4); 
		Poc09.reverse(ints);
		System.out.println(ints);
	}
	
	public static <T> void  reverse(List<T> list) { 
		List<T> tmp = new ArrayList<T>(list);
			for (int i = 0; i < list.size(); i++) {
				list.set(i, tmp.get(list.size()-i-1)); 
		}
	}

}
