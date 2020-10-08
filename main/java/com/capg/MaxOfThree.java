package com.capg;

import java.util.ArrayList;
import java.util.Collections;

public class MaxOfThree <E extends Comparable<E>> {
	ArrayList<E> arr=new ArrayList<E>();
	
	public MaxOfThree(E ... a) {
		for(E x:a) {
			arr.add(x);
		}
	}
	
	public E findMax() {
		return MaxOfThree.findMax(arr);
	}
	
	public static <E extends Comparable<E>> E findMax(ArrayList<E> li) {
		E max=Collections.max(li);
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To MaxFinder");
		Integer xInt=1, yInt= 2, zInt= 3;
		Float xFloat=8.6f, yFloat=9.9f, zFloat=2.3f;
		String xStr="Apple", yStr="Peach", zStr="Banana";
		System.out.println("Max Integer is "+new MaxOfThree<Integer>(xInt, yInt, zInt).findMax());
		System.out.println("Max Float is "+new MaxOfThree<Float>(xFloat, yFloat, zFloat).findMax()); 
		System.out.println("Max String is "+new MaxOfThree<String>(xStr, yStr, zStr).findMax()); 
	}
}
