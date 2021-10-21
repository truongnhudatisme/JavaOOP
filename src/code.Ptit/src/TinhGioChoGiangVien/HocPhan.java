package TinhGioChoGiangVien;

public class HocPhan {
    private String tenhocphan, mahocphan;
    public HocPhan(String mahocphan, String tenhocphan){
        this.tenhocphan  = tenhocphan;
        this.mahocphan = mahocphan;
    }
    public String getMahocphan(){
        return mahocphan;
    }
    public String getTenhocphan(){
        return tenhocphan;
    }
}
