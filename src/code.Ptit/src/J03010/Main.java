package J03010;

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> ds = new HashMap<>();
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
            String kq ="";
			out+= arrout[arrout.length-1];
			for(int i = 0; i < arrout.length-1; i++)
				out+= arrout[i].charAt(0);
            if(ds.get(out) == null){
                ds.put(out,1);
                kq = out + "@ptit.edu.vn";
            }
            else{
                ds.put(out,ds.get(out)+1);
                kq = out + "" + ds.get(out) + "@ptit.edu.vn";
            }
			System.out.println(kq);
		}
        sc.close();
	}
}
