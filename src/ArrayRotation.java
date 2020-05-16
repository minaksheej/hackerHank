
public class ArrayRotation {
	
	public static void rotate(int arr[],int d) {
		int n=arr.length;
		int gcd=findGcd(d,n);
		
		for(int i=0;i<gcd;i++) {
			int temp=arr[i];
			int j=i;
			int k=0;
			while(true) {
				k=j+d;
				if(k>=n) {
					k=k-n;
					
				}				
				if(k==0)
					break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
			print(arr);
		}
		System.out.println("            ");
		print(arr);
				
	}
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print( "  "+arr[i]);
		}
	}
	
	private static int findGcd(int a, int b) {
		if(b==0)
			return a;
		return findGcd(b, a%b);
	}
	
	
	public static void rotate1(int arr[],int d) {
		int n=arr.length;
		for(int i = 0; i < arr.length; i++){
            final int index = (i+d)%n;
            System.out.print(arr[index] + " ");
        }
	}



	public static void main(String[] args) {
		int arr[]=  {1,2,3,4,5};
		int d=2;
		//rotate(arr, d);
		rotate1(arr, d);
		
		
	}
	

}
