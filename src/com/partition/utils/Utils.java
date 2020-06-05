package com.partition.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {


	public static <T> List<List<T>> partition(List<T> list,int size) throws Exception{
			
		// if the list is null or it is empty or the size is negative or = 0 throw exception
		if(list == null  || (list!=null && list.isEmpty()) || size <= 0) throw new Exception("Invalid parameters");
		
		List<List<T>> returnedList = new ArrayList<List<T>>();	
		int listSize = list.size(); //the given list size
		int numberOfLists = (listSize / size); // the number of sublists
		
		if(listSize % size != 0) numberOfLists++;// to check if there will be an additional list or not
		
		List<T> intermediateList = new ArrayList<T>(); //intermediate list to fill the returned list
		
		if(numberOfLists == 0) { // If the given size is bigger than the list size (numberOfCompleteLists will be 0) filled the returned list with all the values 
			for(int i=0;i<listSize;i++) {
				intermediateList.add(list.get(i));
			}
			returnedList.add(intermediateList);
		}else { // If the given size is smaller than the list size (numberOfCompleteLists will be > 0)
			for(int i=0;i<=listSize;i++) { // itirate to listsize to make sure to add the last sublist in the returnedList in the case where (list.size % size = 0)
				if(intermediateList.size() == size) { // If we have filled the sublist with the given size add it to the list
					returnedList.add(intermediateList);
					if(i==listSize) break;
					intermediateList = new ArrayList<T>();
					intermediateList.add(list.get(i));
				}else {
					if(i==listSize) {
						returnedList.add(intermediateList);
						break;
					}
					intermediateList.add(list.get(i));
				}
			}
		}
		return returnedList;
	}
}
