package com.tcs.exceptiondemo;

public class ExceptionDemo {
public static void main(String args[]) throws MyCheckedException {
	demo1();
	demo2();
}
private static void demo1() {
	try {
		System.out.println(1/0);
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Divide by zero");
		}
}
private static void demo2() throws MyCheckedException {
	throw new MyCheckedException();
}
}
