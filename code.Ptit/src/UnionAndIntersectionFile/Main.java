package UnionAndIntersectionFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // WordSet s1 = new WordSet("code.Ptit\\src\\UnionAndIntersectionFile\\DATA1.in");
        // WordSet s2 = new WordSet("code.Ptit\\src\\UnionAndIntersectionFile\\DATA2.in");
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
