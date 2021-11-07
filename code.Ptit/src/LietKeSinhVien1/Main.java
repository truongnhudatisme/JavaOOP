package LietKeSinhVien1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            ds.add(new SinhVien(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String condition = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + condition.trim()+ ":");
            for(SinhVien sv: ds){
                if(sv.getNganh().equals(condition)){
                    String condition1 = sv.getMasv().substring(3,7);
                    if(condition1.equals("DCCN") || condition1.equals("DCAT")){
                        char lopcondition = sv.getLopsv().charAt(0);
                        if(lopcondition == 'E')
                            continue;
                        else{
                            System.out.println(sv);
                        }
                    }
                    else{
                        System.out.println(sv);
                    }
                }
            }
        }
        sc.close();
    }
}
