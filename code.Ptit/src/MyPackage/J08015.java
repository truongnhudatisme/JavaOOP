package MyPackage;

import java.util.Arrays;
import java.util.Scanner;

public class J08015 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			test_Case();
		}
		
		sc.close();
	}
	public static void test_Case() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i])
				max = arr[i];
		}
		int[] count = new int[max+1];
		Arrays.fill(count,0);
		for(int j = 0; j < n; j++) {
			count[arr[j]]++;
		}
		for(int x = 0; x < max +1; x++) {
			if(count[x] == 0)
				continue;
			for(int y = 0; y < max+1; y++) {
				if(count[y] == 0)
					continue;
				if(x + y == k && count[k] != 0)
					System.out.printf("%d %d\n",x,y);
				else
					continue;
			}
		}
	}
}
