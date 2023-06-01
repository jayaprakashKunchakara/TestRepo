
public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="jp is a QA Manager";
		
		String[] arr=str.split(" ");
		int k = arr.length;
		for(int i=0;i<arr.length;i++) {			
		System.out.println("The array of sentence with words is ----" + arr[i]);
		
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("Sentence with words in reverse order ---" + arr[i]);
			
		}
	}

}
