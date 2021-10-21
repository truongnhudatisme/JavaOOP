package Pytago;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			testCase();
		}
		sc.close();
	}
	public static void testCase() {
		int n = sc.nextInt();
		int [] arr = new int[n];
		int max=0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i])
				max = arr[i];
		}
		int[] count = new int[max+1];
		for(int t = 0; t < n; t++)
			count[arr[t]]++;
		for(int j = 1; j < max+1; j++) {
			if(count[j]==0)
				continue;
			for(int k = 1; k < max+1; k++) {
				if((j==k)&&count[j]==1 || count[k] == 0)
					continue;
				int val = (int) Math.sqrt(j*j + k*k);
				if(val > max)
					continue;
				if(val*val != (j*j+k*k))
					continue;
				if(count[val] ==1) {
					System.out.println("YES");
//					break;
				}
			}
		}
		System.out.println("NO");
		
	}

}
