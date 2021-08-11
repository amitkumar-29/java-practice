package com.tcs.abstraction;

public abstract class Staff {
private String name;

public void fillTimesheet() {
	
}
public abstract void work();

}
class HR extends Staff{
	public void work() {
		System.out.println("HR");

	}
}


class Guard extends Staff{
	public void work() {
		System.out.println("Guard");
	}	
}
