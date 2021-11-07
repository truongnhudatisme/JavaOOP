package MyPackage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class J03010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while(n-->0) {
			StringBuilder s = new StringBuilder();
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			while(st.hasMoreTokens()) {
				String tmp = st.nextToken();
				for(int i = 0; i < tmp.length(); i++)
					s.append(Character.toLowerCase(tmp.charAt(i)));
				s.append(" ");
			}
			String[] arrout = s.toString().trim().split("\\s+");
			String out = "";
			out+= arrout[arrout.length-1];
			for(int i = 0; i < arrout.length-1; i++)
				out+= arrout[i].charAt(0);
			out+="@ptit.edu.vn";
			System.out.println(out);
		}
	}

}
