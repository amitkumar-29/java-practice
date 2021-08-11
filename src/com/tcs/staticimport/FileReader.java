package com.tcs.staticimport;
import static java.util.Arrays.*; 
public class FileReader {
public void main(String args[]) {
	int number[]= {9,7,6,5,4};
	sort(number);  //static import
	//Arrays.sort(numbers); ->non-static
}
}
