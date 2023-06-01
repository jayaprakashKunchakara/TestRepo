
public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="ini";
			
		String firstchar=str.substring(0, 1);
		System.out.println("first char of the string is ---" + firstchar);
		String lastchar=str.substring(str.length()-1, str.length());
		System.out.println("last char of the string is ---" + lastchar);
		
		if(firstchar.equals(lastchar)) {
			System.out.println("Given String is a palendrome");
		}else {
			System.out.println("Given string is not a palendrome ---" + str);
		}

	}

}
