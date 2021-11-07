package MyPackage;

import java.io.*;

public class J07005 {
    public static void main(String[] args) throws IOException {
    	DataInputStream  file = new DataInputStream(new FileInputStream("DATA.IN"));
    	int[] a = new int[100000];
    	for(int i = 0; i < 100000; i++)
    		a[file.readInt()]++;
    	for(int i = 0; i < 100000; i++)
    		if(a[i] > 0)
    				System.out.println(i + " " + a[i]);
    }   
}
