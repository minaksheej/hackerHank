import java.util.HashSet;
import java.util.Set;

public class AppleOrangeProbleam {

	public static void main(String[] args) {
		int apples[]= {-2, 2, 1};
		int orange[]= {5,-6};
		countApplesAndOranges(7,11,5,15,apples,orange);

	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount = 0;
		int orangeCount = 0;
		Set<Integer> range = new HashSet<>();
		for (int i = s; i <= t; i++) {
			range.add(i);
		}
		for (int i = 0; i <apples.length; i++) {
			int val = apples[i] + a;
			if (range.contains(val)) {
				appleCount++;
			}
		}

		for (int i = 0; i <oranges.length; i++) {
			int val= oranges[i] + b;
			if (range.contains(val)) {
				orangeCount++;
			}
		}
		
		System.out.println(appleCount);
		System.out.println(orangeCount );

	}
}
