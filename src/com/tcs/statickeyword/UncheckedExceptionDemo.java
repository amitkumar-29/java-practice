package com.tcs.statickeyword;

import com.tcs.uncheckedexceptiondemo.MyUncheckedException;

public class UncheckedExceptionDemo {
public static void main(String[] args) {
	User user=new User();
	user.work();
}
}
class User{
	int age=70;
	public void work() {
		if(age<=18) {
			throw new MyUncheckedException("No child labor");
		}
		else if(age>60) {
			throw new OverAgeException("Over age");
		}
	}
}
