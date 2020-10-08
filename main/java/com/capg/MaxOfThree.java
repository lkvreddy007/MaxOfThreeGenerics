package com.capg;

public class MaxOfThree <E extends Comparable<E>> {
	E x,y,z;
	
	public MaxOfThree(E x,E y,E z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public E findMax() {
		return MaxOfThree.findMax(x, y, z);
	}
	
	public static <E extends Comparable<E>> E findMax(E x,E y,E z) {
		E max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}
	
	public static <E> void printMax(E x,E y,E z,E max) {
		System.out.println("Max of "+x+", "+y+" and "+z+" is "+ max);
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
