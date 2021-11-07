package VaoRaFile;

import java.io.*;
import java.util.*;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) file.readObject();
        int a[] = new int[10000];
		for(Integer i : ds) {
			if(isPrime(i)) {
				a[i]++;
			}
		}
		for(int i=0; i<10000; i++) {
			if(a[i]>0) {
				System.out.println(i+" "+a[i]);
            }
        }
    }

    private static boolean isPrime(Integer k) {
        if(k < 2)
            return false;
        for(int i = 2; i*i <= k; i++)
            if(k%i == 0)
                return false;
        return true;
    }
}
