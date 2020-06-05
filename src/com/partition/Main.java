package com.partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.partition.utils.Utils;

public class Main {

	public static void main(String[] args) throws Exception {
		int size;
		try {
			size = Integer.parseInt(args[args.length-1]);
		}catch(Exception e) {
			size = 2;
		}
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<args.length-1;i++) {
			list.add(args[i]);
		}
		
		List<List<String>> result = Utils.partition(list, size);
		for(List<String> l : result) {
			System.out.println(l);
		}
		
		// customizeTest();
	}

	
	public static void customizeTest() throws Exception {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7); //the initial list
		List<List<Integer>> r = Utils.partition(list, 3); //partition function call with the initial list and the size of sublists
		for(List<Integer> l : r) {
			System.out.print(l);
		}
		System.out.println("Done");
	}
}
