
public class ReverseAsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="jayaprakash is working on testing";
		
		String result2="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			result2=result2+str.charAt(i);			
			
		}
		
		System.out.println("the reverse string of sentence is --- " + result2);

	}

}
