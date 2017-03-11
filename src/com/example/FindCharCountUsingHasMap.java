package com.example;

import java.util.HashMap;

public class FindCharCountUsingHasMap {
	
	public static void main(String[] args) {
		String str = "HirenMavani";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch : str.toCharArray()){
			if(map.containsKey(ch)){
				int val = map.get(ch);
				map.put(ch, val+1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		str="Programmer is Programmer Java is Programmer Java";
		HashMap<String,Integer> m = new HashMap<>();
		String ar[]  =str.split(" ");		
		for(String s : ar){
			if(m.containsKey(s)){
				m.put(s, m.get(s)+1);
			} else {
				m.put(s, 1);
			}
		}
		System.out.println(m);
		
		String input="This is The Method";
		char[] arr = input.toCharArray();
		str="";
		for(char c:arr){
			if(c>65 && c<97){
				str += String.valueOf(c).toLowerCase();
			} else {
				str += String.valueOf(c).toUpperCase();
			}
		}
		System.out.println(str);
	}

}
