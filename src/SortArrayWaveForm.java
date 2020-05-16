import java.util.Arrays;

public class SortArrayWaveForm {

	public static void sortInWaveForm1(int arr[]) {
		int n=arr.length;
		Arrays.sort(arr);
		System.out.println( );
		print(arr, n);
		//now swap every alternative number
		for(int i=0;i<n-1;i++) {
			int temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
		}
		System.out.println( );
		print(arr, n);
		

	}

	/*
	 * O(n) replace every even position number with prev or next
	 */
	public static void sortinWaveForm(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i += 2) {
			if (i > 0 && arr[i - 1] > arr[i]) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}

			if (i < n && arr[i + 1] > arr[i]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}

		}
		print(arr, n);
	}

	public static void print(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 6, 3, 2, 20, 100, 80 };
		sortinWaveForm(arr);
		sortInWaveForm1(arr);

	}

}
