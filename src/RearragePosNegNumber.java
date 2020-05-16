
public class RearragePosNegNumber {

	
	public static void rearrange(int arr[]) {
		
		int n=arr.length;		
		int i=-1;
		int temp=0;
		for(int j=0;j<n;j++) {
			if(arr[j]<0) {
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		
	 int pos=i+1;
	 int neg=0;
	 while(pos<n && neg<pos&& arr[neg]<0) {
		 temp=arr[neg];
		 arr[neg]=arr[pos];
		 arr[pos]=temp;
		 pos++;
		 neg +=2;
	 }
	
		
		print(arr, n);
	}
	
	static void print(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {-1,2,-3,4,5,6,-7,8,9};
		rearrange(arr);

	}

}
