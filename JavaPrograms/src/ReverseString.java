
public class ReverseString {

	
	public static void main(String[] args) {
		
		String str="jaya";
		
		StringBuffer sb = new StringBuffer(str);
		
		String str2 = sb.reverse().toString();
		
		System.out.println("reverse string is ----" + str2);
		
		String result1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			//for(int i=3;i>=0;i--)
			
			result1=result1+str.charAt(i);
				
		}
		
		System.out.println("reverse string  is   -" + result1);
	}
}
