package com.tcs.statickeyword;

public class StaticBlockDemo {
public StaticBlockDemo() {
	System.out.println("Constructor");
}
static {
	System.out.println("Static Block");
}
public static void main(String args[]) {
	StaticBlockDemo demo=new StaticBlockDemo();
	new StaticBlockDemo();
}
}
