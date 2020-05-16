
public class KangarooProbleam {

	public static void main(String[] args) {
		System.out.println(kangaroo(0, 3, 4,2));
		System.out.println(kangaroo(0, 2, 5, 3));

	}

	static String kangaroo(int x1, int v1, int x2, int v2) {
		if (x1 < x2 && v2 > v1) {
			return "NO";
		}
		int d1 = x1 + v1;
		int d2 = x2 + v2;
		while (d1 != d2) {
			d1 += v1;
			d2 += v2;
		}
		if (d1 == d2) {
			return "YES";
		}
		return "NO";

	}

}
