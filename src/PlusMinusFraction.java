import java.text.DecimalFormat;

public class PlusMinusFraction {

	static void plusMinus(int[] arr) {
		int n = arr.length;
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				zero++;

			}
			if (arr[i] > 0) {
				pos++;
			}

			if (arr[i] < 0) {
				neg++;
			}
		}
		double posv=(double)pos/n;
		double negv=(double)neg/n;
		double zerov=(double)zero/n;		
		DecimalFormat df = new DecimalFormat("#.000000");
		System.out.println(df.format(posv));
		System.out.println(df.format(negv));
		System.out.println(df.format(zerov));

		//precisionCompute(pos,n,6);
		//precisionCompute(neg,n,6);
		//precisionCompute(zero,n,6);

		
	}

	public static void precisionCompute(double x, double y, int n) {		
		if (y == 0) {		
			return;
		}
		if (x == 0) {
			System.out.print("0");
			return;
		}
		if (n <= 0) {			
			System.out.print(x / y);
			return;
		}

		
		if (((x > 0) && (y < 0)) || ((x < 0) && (y > 0))) {
			System.out.print("-");
			x = x > 0 ? x : -x;
			y = y > 0 ? y : -y;
		}

		
		double d = (double)x / y;		
		for (int i = 0; i <= n; i++) {
			System.out.println(d);
			x = x - (y * d);
			if (x == 0) {
				break;
			}			
			x = x * 10;
			d = x / y;
			if (i == 0)
				System.out.print(".");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, -1, -1 };
		plusMinus(arr);
	}

}
