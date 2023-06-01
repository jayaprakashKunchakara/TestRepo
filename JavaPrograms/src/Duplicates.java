import java.io.*;
import java.util.*;
import java.util.Map;


public class Duplicates {

	public static void main(String[] args) {
		
		String str ="prakashkunchakara";
		char[] arr= str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		Integer count=1;
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Character key: map.keySet() ) {
			if(map.get(key)>1) {
				System.out.println("the duplicate char is -- " + key +":"+ map.get(key));
				
			}
		}
		
	}
}
