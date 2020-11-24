package com.techreturners.exercise001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise001 {

	public static void main(String[] args) {
		int[] arr = {4,5,7,5,4,8};
		int sum = singles(arr);
		
		System.out.println("Sum of integers in array will single occurance : " +sum);

	}
	
	public  static int singles(int [] arr){
	
		Integer[] objectArray = new Integer[arr.length];

		for(int i = 0; i < arr.length; i++) {
		    objectArray[i] = Integer.valueOf(arr[i]); // returns Integer value
		}
		
		List<Integer> l =  Arrays.asList(objectArray);
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for(Integer j : l) {
			if(hm.containsKey(j)) {
				hm.put(j, hm.get(j)+1);
			}else {
				hm.put(j, 1);
			}
		}
		
		int result =hm.entrySet().stream().filter(s->s.getValue().equals(1))
		.map(Map.Entry::getKey)
		.reduce(0, (sum,element)-> sum+element);
	
		
        return result;
    }

}
