package com.tcs.entity;

public class StringbufferDemo {
public static void main(String[] args) {
	String literal="Tcs";
	String newkey=new String("Tcs"); //immutable
	StringBuilder strBuilder=new StringBuilder("TCS"); //Not thread safe,mutable
	StringBuffer strBuffer=new StringBuffer("TCS");  //Thread Safe,mutable

}
}
