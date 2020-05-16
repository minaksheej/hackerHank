
public class CountOfA {
	
	static long repeatedString(String s, long n) {
		long countA=searchA(s);
		if(countA==0) {
			return 0;
		}
		long remCout=0;
		long rem=n%s.length();
		if(rem>0) {
			for(int i=0;i<rem;i++) {
				if(s.charAt(i)=='a')
					remCout++;
			}
		}
		return (remCout)+(countA*(n/s.length()));

	}
	
	private static long searchA(String s) {		
		long count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		long count=repeatedString("udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps",872514961806L);
		System.out.println(count);
	}
	

}
