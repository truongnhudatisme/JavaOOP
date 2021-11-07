package LietKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSet {
    private String filename;
    private TreeSet<String> ds;
    private String result = "";
    public WordSet(String filename) throws FileNotFoundException {
        this.filename = filename;
        xuly();
    }
    private void xuly() throws FileNotFoundException{
        Scanner sc = new Scanner(new File(filename));
        ds = new TreeSet<String>();
        while(sc.hasNextLine()){
            String[]s = sc.nextLine().split("\\s+");
            for(int i = 0; i < s.length; i++){
                ds.add(s[i].toLowerCase());
            }
        }
        // ds.forEach(System.out::println);
        sc.close();
    }
    @Override
    public String toString() {
        ds.forEach(e -> result+= (e + "\n"));
        return result.trim();
    }

    
}
