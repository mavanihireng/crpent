package com.example;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToMapExample {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student s = new Student();
		s.setId(1);
		s.setName("Hiren");
		list.add(s);
		s.setId(2);
		s.setName("Taruu");
		list.add(s);
		
		String a[] = list.toArray(new String[list.size()]);
		System.out.println(a);
		
	}

}
