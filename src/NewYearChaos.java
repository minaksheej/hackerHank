
public class NewYearChaos {

	public static int minimumBribe(int arr[]) {
		int bribeCount = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
				if (arr[i] < arr[j])
					break;

			}
			if (count > 0) {
				if (count > 2) {
					System.out.println("Too chaotic");
					break;
				} else {
					bribeCount +=count;
				}

			}

		}
		if(bribeCount>0) {
			System.out.println(bribeCount);
	
		}
		return 0;

	}
	
	public static void bribe(int arr[]) {
		int bribe=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int diff=arr[i]-arr[i+1];
				if(diff>2) {
					System.out.println("Too chaotic");
					break;
				}else {
					bribe +=diff;
				}
			}
		}
		if(bribe>0)
		System.out.println(bribe);
	}
	
	public static void bribeCount(int arr[]) {
		int ans=0;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i-1]-arr[i]>2) {
				System.out.println("Too chaotic");
				return;
			}
			for(int j=Math.max(0,arr[i]-2);j<i;j++) {
				if(arr[j]>arr[i])
					ans++;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 3, 4 };
		int arr1[]= {1, 2, 5, 3, 7, 8, 6, 4};
		//minimumBribe(arr);
	int arr2[]= {5 ,1, 2, 3, 7, 8, 6, 4};
		bribeCount(arr2);
		bribeCount(arr1);
		bribeCount(arr);
	}

}
