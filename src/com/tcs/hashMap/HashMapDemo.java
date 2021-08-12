package com.tcs.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		createHashMap();
	}

	private static void createHashMap() {
		Map<String,Student> mathScores = new HashMap<>();
		for(int i=0;i<20;i++) {
			mathScores.put("student"+i,
					new Student(new Float(100*Math.random()),new Float(100*Math.random()),new Float(100*Math.random())));
		}
		
		System.out.println(mathScores);
		boolean exists=mathScores.containsKey("student1");
		mathScores.put("student1",new Student(34F,35F,36F));
		
	}
}
