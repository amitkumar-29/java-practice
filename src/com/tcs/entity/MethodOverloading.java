package com.tcs.entity;

public class MethodOverloading {
	public static void main(String [] args) {
User1 u1=new Employee1();
u1.work();
u1.work(10);
	}
}

class User1{
	public void work() {
		System.out.println("0");

	}
	public void work(int duration) {
		System.out.println(duration);
	}
}
class Employee1 extends User1{
	@Override
	public void work() {
		System.out.println("In Employee");

	}
}
