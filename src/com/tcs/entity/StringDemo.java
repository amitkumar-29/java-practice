package com.tcs.entity;

public class StringDemo {
public static void main(String [] args) {
	String s1="TCS";//String Pool
	String s2=new String("TCS");//Normal Heap
	String s3=s1+s2;//Normal Heap
	StringBuilder sb=new StringBuilder("Tcs");
	
//	System.out.println(s3);
	sb.append(",Banglore");
	System.out.println(sb);

	
}
}
