
public class Staircase {

	public static void main(String[] args) {
		getHash(6);
	}

	static void staircase(int n) {
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
		
	}
	
	public static String  getHash(int i) {
		StringBuilder hashBuilder=new StringBuilder();
		while(i>0) {
			hashBuilder.append("#");
			System.out.println(appendSpace(i)+hashBuilder.toString());
			i--;
		}
		return hashBuilder.toString();
	}
	
	
	public static String appendSpace(int n) {	
		StringBuilder spaceBuilder=new StringBuilder();
		for(int i=0;i<n-1;i++) {
			spaceBuilder.append(" ");
		}
		return spaceBuilder.toString();
		
	}

}
