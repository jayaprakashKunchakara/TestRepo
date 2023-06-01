
public class CountOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "java is a good language for software developers";
		
		Integer result = str.length()-str.replaceAll("a", "").length();
		System.out.println("The occurance of the charecter--"+ "a" + " --is " + result);
		
		Integer result1 = str.length()-str.replaceAll("o", "").length();
		System.out.println("The occurance of the charecter---" + "o" + " --is " + result1);
		
		Integer result2 = str.length()-str.replaceAll("e", "").length();
		System.out.println("The occurance of the charecter--" + "e" + "--is " + result2);

	}

}
