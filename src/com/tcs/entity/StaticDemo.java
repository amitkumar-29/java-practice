package com.tcs.entity;

public class StaticDemo {
public static void main(String [] args) {
	Bank bank=new Bank();
	Bank.createNewAccNumber();
	System.out.println( Bank.createNewAccNumber());
	System.out.println( bank.instanceVariable);

	Bank bank1=new Bank();
	Bank.createNewAccNumber();
	System.out.println( bank1.createNewAccNumber());
	System.out.println( bank1.instanceVariable);

}
}
class Bank{
	static int counter;
 int instanceVariable=10;
	public static int createNewAccNumber() {
		return ++counter;
	}
}
