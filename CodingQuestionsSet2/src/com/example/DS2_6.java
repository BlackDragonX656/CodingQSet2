package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DS2_6 {
	public HashMap<String,Integer> sortHashMap(HashMap<String,Integer> m) {
		
		List<Map.Entry<String,Integer>> l = new ArrayList<Map.Entry<String,Integer>>(m.entrySet());
		
		Collections.sort(l, new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		HashMap<String, Integer> sortedhm = new HashMap<String,Integer>();
		for(Map.Entry<String, Integer> e: l) {
			sortedhm.put(e.getKey(), e.getValue());
		}
		
		return sortedhm;
	}
}
