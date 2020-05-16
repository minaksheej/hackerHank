
public class JumpingOfCloud {

	 static int jumpingOnClouds(int[] c) {
	        int noOfSteps=1;
	        int noS=0;
	        int val=0;
	        for(int i=0;i<c.length-2;i++){
	            if(c[i]==1)
	             {
	                continue;
	            }if(c[i]==0){
	                if(c[i+2]==0){
	                	noS=noS+1;
	                	i++;
	                }else{
	                	noS++;
	                }
	            } 
	            noOfSteps=noS;
	            val=i;
	        }
	        int count=0;
	        if(val>0) {
	        	for(int j=val;j<c.length;j++) {	        	
		        	if(c[j]==0) {
		        		count++;
		        	}
		        }
		        if(count==2) {
		        	noOfSteps=noOfSteps+1;
		        }	
	        }
	        
	        return noOfSteps;

	    }
	public static void main(String[] args) {
		int arr[] = {0,0};//{0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0 ,1, 0, 1, 0};
		int count=jumpingOnClouds(arr);
		System.out.println(count);
	}

}
