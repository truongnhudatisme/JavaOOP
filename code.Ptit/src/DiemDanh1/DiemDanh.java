package DiemDanh1;

public class DiemDanh implements Comparable<DiemDanh> {
    private SinhVien sv;
    private String xaudiemdanh;
    public DiemDanh(SinhVien sv, String xaudiemdanh) {
        this.sv = sv;
        this.xaudiemdanh = xaudiemdanh;
        xuly();
    }
    
    public SinhVien getSv() {
        return sv;
    }

    private void xuly(){
        char[] s = xaudiemdanh.toCharArray();
        for(int i = 0; i < s.length; i++){
            if(s[i] == 'x')
                continue;
            else if(s[i] == 'v')
                sv.setDiemcc(sv.getDiemcc()-2);
            else
                sv.setDiemcc(sv.getDiemcc()-1);
        }
        if(sv.getDiemcc() <= 0){
            sv.setGhichu("KDDK");
            sv.setDiemcc(0);
        }
    }
    @Override
    public String toString() {
        return sv.toString();
    }
    @Override
    public int compareTo(DiemDanh o) {
        if(this.sv.getStt() < o.sv.getStt())
            return -1;
        else 
            return 1;
    }
    
    
}
