package MyPackage;

import java.util.Scanner;

public class J02012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for(int j = 1; j < n-1; j++) {
			int value = arr[j];
			int k = j -1;
			while(k >= 0 && arr[k] > value) {
				arr[k+1] = arr[k];
				k = k - 1;
			}
			arr[k+1] = value;
		}
	}

}
