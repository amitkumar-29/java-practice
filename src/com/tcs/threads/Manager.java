package com.tcs.threads;

import java.util.Iterator;

public class Manager {
public static void main(String[] args) throws Exception {
	for(int i=0;i<10;i++) {
	Worker worker1=new Worker();
	Thread t1=new Thread(worker1);
	t1.start();
	t1.join();
	System.out.println(Thread.currentThread());	
	}

}
}
