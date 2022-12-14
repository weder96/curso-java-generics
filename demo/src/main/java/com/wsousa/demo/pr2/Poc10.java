package com.wsousa.demo.pr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poc10 {

	public static <T> List<T> factory() { return new ArrayList<T>(); } 

	public static void main(String[] args) {
		List<Integer> list = Poc10.factory();
		List<?> list2 = Poc10.<Object>factory();
	}

}
