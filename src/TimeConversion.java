
public class TimeConversion {

	public static void main(String[] args) {
		System.out.println(timeConversion("07:05:45PM"));
	}

	static String timeConversion(String str) {
		int h1 = (int) str.charAt(1) - '0';
		int h2 = (int) str.charAt(0) - '0';
		int hh = (h2 * 10 + h1 % 10);
		StringBuilder builder=new StringBuilder();
		if (str.charAt(8) == 'A') {
			if (hh == 12) {				
				builder.append("00");
				for (int i = 2; i <= 7; i++) {
					builder.append(str.charAt(i));
				}
			} else {
				for (int i = 0; i <= 7; i++) {
					builder.append(str.charAt(i));
				}
			}
		} else {
			if (hh == 12) {
				builder.append("12");
				for (int i = 2; i <= 7; i++) {
					builder.append(str.charAt(i));
				}
			} else {
				hh = hh + 12;
				builder.append(hh);
				for (int i = 2; i <= 7; i++) {
					builder.append(str.charAt(i));
				}
			}
		}
		return builder.toString();

	}

}
