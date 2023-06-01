import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Army";
		String str2="maRy";
		
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		System.out.println(arr1);
		Arrays.sort(arr2);
		System.out.println(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given Strings are Anagrams");
		}else {
			System.out.println("The given Strings are not Anagrams");
		}

	}

}
