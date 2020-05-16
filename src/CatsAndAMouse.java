
public class CatsAndAMouse {

	public static void main(String[] args) {
		//System.out.println(catAndMouse(1, 2, 3));
		System.out.println(catAndMouse(1, 3, 2));
	}

	static String catAndMouse(int x, int y, int z) {
		int cat1=Math.abs(z-x);
		int cat2=Math.abs(z-y);
		if(cat2==cat1) {
			return "Mouse C";
		}else if(cat2>cat1) {
			return "Cat A";
		}else if(cat2<cat1) {
			return "Cat B";
		}
		return null;
		
	}

}
