package MyPackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;


public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		BigInteger a;
		BigInteger b;
		if(s.length()%2==0){
			a = new BigInteger(s.substring(0,(s.length())/2)); 
			b = new BigInteger(s.substring((s.length())/2));
		}
		else{
			a = new BigInteger(s.substring(0,(s.length())/2)); 
			b = new BigInteger(s.substring((s.length())/2+1));
		}
		System.out.println(a + " " + b);
    }

}
