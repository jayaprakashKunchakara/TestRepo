
import java.util.*;
import java.util.Map.Entry;

public class NonRepeatedChar {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="prakashkunchakaraprakash";
		char[] arr= str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		Integer count=1;
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), count);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet() ) {
			if(entry.getValue()==1) {
				System.out.println("the non repeated char is --"+ ":"+ entry.getKey());

				
			}
		}
		
		
	}

}
