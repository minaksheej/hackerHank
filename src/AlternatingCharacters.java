
public class AlternatingCharacters {

	
	
	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAAA"));
		System.out.println(alternatingCharacters("BBBBB"));
		System.out.println(alternatingCharacters("ABABABAB"));
		System.out.println(alternatingCharacters("BABABA"));
		System.out.println(alternatingCharacters("AAABBB"));

		//AAAA
		//ABABABAB
	}
	
	static int alternatingCharacters(String s) {
		int deleteCount = 0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				deleteCount++;
			}
			
		}
		return deleteCount;


    }

}
