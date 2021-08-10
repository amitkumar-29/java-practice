package com.tcs.entity;

import java.util.Arrays;

public class ArraysDemo {
public static void main(String [] args) {
	int [] no=new int[10];
	no[5]=9;
	no[2]=12;
	Arrays.sort(no, 0, no.length);
	for(int i=0;i<no.length;i++) {
		System.out.println(no[i]);
		
		
	}
	EnchancedForLoop();
}
private static void EnchancedForLoop() {
	int numbers[]=new int[10];
	numbers[0]=1;
	numbers[1]=2;
	for(int number:numbers) {
		if(number%2==0)
		System.out.println(number);

	}
	
}
}
