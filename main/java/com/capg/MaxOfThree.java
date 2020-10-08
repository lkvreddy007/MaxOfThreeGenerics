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
	
	public static Float findMax(Float x,Float y,Float z) {
		Float max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		System.out.println(max);
		return max;
	}
	
	public static String findMax(String x,String y,String z) {
		String max=x;
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
		findMax(8.6f,9.9f,2.3f);
		findMax("Apple", "Peach", "Banana");
	}
}
