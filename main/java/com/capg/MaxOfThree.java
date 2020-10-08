package com.capg;

public class MaxOfThree {
	
	public static Integer findMax(Integer x,Integer y,Integer z) {
		Integer max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		System.out.println(max);
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To MaxFinder");
		findMax(1, 2, 3);
	}
}
