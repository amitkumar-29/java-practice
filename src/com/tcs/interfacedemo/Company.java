package com.tcs.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Company {
public static void main(String args[]) {
	Staff s1=new Guard();
	Staff s2=new HR();
	s1.work();
	s2.work();
	List<Staff> staffs=new ArrayList<Staff>();
	staffs.add(s1);
	staffs.add(s2);
	System.out.println(staffs.size());
	
}
}
