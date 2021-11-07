package MyPackage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class J03005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			StringBuilder s1 = new StringBuilder();
			StringTokenizer s2 = new StringTokenizer(sc.nextLine());
			while(s2.hasMoreTokens()) {
				String s = s2.nextToken();
				s1.append(Character.toUpperCase(s.charAt(0)));
				for(int j = 1; j < s.length(); j++)
					s1.append(Character.toLowerCase(s.charAt(j)));
				s1.append(" ");
			}
//			System.out.println(s1.toString().trim());
			String[] output = s1.toString().trim().split("\\s+");
			String out = "";
			for(int k = 1; k < output.length-1; k++) {
				out += output[k];
				out += " ";
			}
			out+= output[output.length-1];
			out+=", ";
			out += output[0].toUpperCase();
			System.out.println(out);
		}

	}

}
