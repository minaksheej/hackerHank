import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudent {

	public static void main(String[] args) {
		Integer arr[] = { 73, 67, 38, 33 };
		List<Integer> arrList =Arrays.asList(arr);
		List<Integer> result=gradingStudents(Arrays.asList(arr));
		for(Integer val:result){
			System.out.println(val);
		}

	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> results = new ArrayList<>();
		for (Integer grade : grades) {
			if (grade < 38) {
				results.add(grade);
			} else {
				if ((grade + 2) % 5 == 0) {
					results.add(grade + 2);
				} else if((grade + 1) % 5 == 0) {
					results.add(grade + 1);
				}else {
					results.add(grade);
				}
			}
		}
		return results;

	}

}
