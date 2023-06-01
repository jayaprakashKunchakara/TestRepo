

import java.io.*;
import java.util.*;
import java.util.Map;

public class CountNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="I am learning java java learning";
		
		//Map crated where the String is key and count of key will be integer
		Map<String,Integer> map= new HashMap<String,Integer>();
		Integer count=1;
		String[]  arr = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			//if the map does not contain that string like arr[i] then place it in map
			//with map(a[i], count of the String)
			if(!map.containsKey(arr[i])){
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
	
		}
		
		for(String x: map.keySet()) {
			System.out.println("count of the word : " + x + " = " + map.get(x));
		}
		
	}

}
