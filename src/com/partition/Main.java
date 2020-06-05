package com.partition;

import java.util.ArrayList;
import java.util.List;

import com.partition.utils.Utils;

public class Main {

	public static void main(String[] args) throws Exception {
		
		int size = Integer.parseInt(args[args.length-1]);
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<args.length-1;i++) {
			list.add(args[i]);
		}
		
		List<List<String>> result = Utils.partition(list, size);
		for(List<String> l : result) {
			System.out.println(l);
		}
	}

}
