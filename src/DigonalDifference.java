import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigonalDifference {

	
	public static int diagonalDifference(List<List<Integer>> arr) {
        int dg1=0;
        int dg2=0;
        int n=arr.size();
        for (int i = 0; i < arr.size(); i++) { 
            for (int j = 0; j < arr.get(i).size(); j++) { 
                System.out.print(arr.get(i).get(j) + " "); 
                if(i==j) {
                	dg1=dg1+arr.get(i).get(j);
                }
                if(i==n-1-j) {
                	dg2=dg2+arr.get(i).get(j);
                }
            } 
            System.out.println(); 
        } 
    
        int diff=Math.abs(dg1-dg2);
        
		return diff;
        


    

    }
	public static void main(String[] args) {
		List<List<Integer>> arr=new ArrayList<>();
		List<Integer> row1=new ArrayList<Integer>(Arrays.asList(1,2,3));
		List<Integer> row2=new ArrayList<Integer>(Arrays.asList(4,5,6));
		List<Integer> row3=new ArrayList<Integer>(Arrays.asList(9,8,9));
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		int diff=diagonalDifference(arr);
		System.out.println("difference "+diff);

	}

}
