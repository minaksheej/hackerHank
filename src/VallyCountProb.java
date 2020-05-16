
public class VallyCountProb {

	
	static int countingValleys(int n, String s) {
        int level=0;
        int vCount=0;
        for(int i=0;i<s.length();i++){
            if('U'==s.charAt(i))
                level++;
            if(s.charAt(i)=='D')
                level--;

           if(level==0 && s.charAt(i)=='U'){
               vCount++;
           }         
        }
        return vCount;

    }
	public static void main(String[] args) {
		int count=countingValleys(10,"DUDDDUUDUU");
		System.out.println(count);
	}

}
