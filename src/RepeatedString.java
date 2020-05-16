
public class RepeatedString {

	static long repeatedString(String s, long n) {
		long countOfA = countOfA(s);
		if(countOfA==1) {
			return n;
		}
		long divd=(long) (n/s.length());
		long rem=(long) (n%s.length());
		if(rem==0) {
			return divd*countOfA;
		}else{
			long count=divd*countOfA;
			for(int i=0;i<rem;i++) {
				if(s.charAt(i)=='a') {
					count++;
				}
			}
			return count;
		}		
		

	}

	static long countOfA(String s) {
		if (s.length() == 1) {
			if (s == "a") {
				return 1;
			} else {
				return 0;
			}
		} else {
			return searchA(s);
		}

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
		long count=repeatedString("a",1000000000000L);
		System.out.println(count);
		long count1=repeatedString("abcac",10);
		System.out.println(count1);
		
	}

}
