package XepHangHocSinh1;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<HocSinh> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ds.add(new HocSinh(i,sc.nextLine(), sc.nextLine()));
        }
        List<HocSinh> dsnew = ds.stream().sorted().collect(Collectors.toList());
        int rank = 1;
        for(HocSinh hs: dsnew){
            hs.setRank(rank);
            rank++;
        }
        for(int i = 0; i < dsnew.size() - 1; i++){
            if(dsnew.get(i).getDiemtb() == dsnew.get(i+1).getDiemtb()){
                int rank1= dsnew.get(i).getRank();
                dsnew.get(i+1).setRank(rank1);
            }
        }
        ds.forEach(System.out::println);
    }
}
