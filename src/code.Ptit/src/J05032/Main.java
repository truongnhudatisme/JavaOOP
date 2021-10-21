package J05032;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Person> ds = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String[] a = sc.nextLine().split("\\s+");
			ds.add(new Person(a[0],a[1]));
		}
		Collections.sort(ds);
		System.out.println(ds.get(ds.size()-1));
		System.out.println(ds.get(0));
	}

}
