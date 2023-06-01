
public class LastFourChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="www.jayaprakash.com";
		
		//substring(startIndex, lastIndex)
		String k = str.substring(0, 5);
		System.out.println("fist 5 chars of the given string --- " + k);
		
		String j = str.substring(str.length()-5, str.length());
		
		System.out.println("last five chars ---" + j);
	}

}
