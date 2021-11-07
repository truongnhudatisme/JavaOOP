package UnionAndIntersectionFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
public class WordSet {
    private String filename;
    public WordSet(String filename) {
        this.filename = filename;
    }
    public String union(WordSet s) throws FileNotFoundException{
        // TreeSet<String> tree = new TreeSet<>();
        ArrayList<String> listunion = new ArrayList<>();
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()){
            listunion.add(sc.next().toLowerCase());
        }
        sc.close();
        sc = new Scanner(new File(s.filename));
        while(sc.hasNext()){
            listunion.add(sc.next().toLowerCase());
        }
        sc.close();
        String result = "";
        List<String> resultList  = listunion.stream().distinct().sorted().collect(Collectors.toList());
        for(String tmp: resultList){
            result+= tmp;
            result+= " ";
        }
        return result.trim();
    }
    public String intersection(WordSet s) throws FileNotFoundException{
        TreeMap<String,Integer> tree = new TreeMap<>();
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()){
            String item = sc.next().toLowerCase();
            if(tree.get(item) == null){
                tree.put(item,1);
            }
            else{
                tree.put(item,tree.get(item) + 1);
            }
        }
        sc.close();
        sc = new Scanner(new File(s.filename));
        while(sc.hasNext()){
            String item = sc.next().toLowerCase();
            if(tree.get(item) == null){
                tree.put(item,1);
            }
            else{
                tree.put(item,tree.get(item) + 1);
            }
        }
        sc.close();
        String result = "";
        for(String key : tree.keySet()){
            if(tree.get(key) >= 2){
                result += (key + " ");
            }
        }
        return result.trim();
    }
}

