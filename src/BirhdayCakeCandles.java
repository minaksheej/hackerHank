public class BirhdayCakeCandles {
	public static void main(String[] args) {
		int arr[] = { 18, 90, 90, 13, 90, 75, 90, 8, 90, 43 };
		System.out.println(birthdayCakeCandles(arr));
	}

	static int birthdayCakeCandles(int[] arr) {
		int maxCount = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				maxCount++;
			}

		}
		return maxCount;

	}

}
