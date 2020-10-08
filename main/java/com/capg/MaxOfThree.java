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
		E max;
		if(li.size()>0) {
			max=Collections.max(li);
		}
		else {
			max=null;
		}
		printMax(li, max);
		return max;
	}
	
	public static <E> void printMax(ArrayList<E> a,E max) {
		String s="";
		for(E x:a) {
			s= s+x+" ";
		}
		System.out.println("Max in "+s+"is "+max);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To MaxFinder");
		Integer xInt=1, yInt= 2, zInt= 3;
		Float xFloat=8.6f, yFloat=9.9f, zFloat=2.3f;
		String xStr="Apple", yStr="Peach", zStr="Banana";
		new MaxOfThree<Integer>(xInt, yInt, zInt).findMax();
		new MaxOfThree<Float>(xFloat, yFloat, zFloat).findMax();
		new MaxOfThree<String>(xStr, yStr, zStr).findMax(); 
	}
}
