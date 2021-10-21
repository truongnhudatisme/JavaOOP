package LietKeSinhVien1;

public class SinhVien {
    private String masv, hotensv, lopsv, emailsv;
    private String nganh;
    public SinhVien(String masv, String hotensv, String lopsv, String emailsv){
        this.masv = masv;
        this.hotensv = hotensv;
        this.lopsv = lopsv;
        this.emailsv = emailsv;
        xuly();
    }
    private void xuly(){
        String ma = masv.substring(3,7);
        if(ma.equals("DCKT")) nganh = "KE TOAN";
        else if(ma.equals("DCCN")) nganh = "CONG NGHE THONG TIN";
        else if(ma.equals("DCAT")) nganh = "AN TOAN THONG TIN";
        else if(ma.equals("DCVT")) nganh = "VIEN THONG";
        else nganh = "DIEN TU";
    }

    public String getMasv(){
        return masv;
    }
    public String getLopsv(){
        return lopsv;
    }
    public String getNganh(){
        return nganh;
    }

    @Override
    public String toString(){
        return masv + " " + hotensv  + " " + lopsv + " " + emailsv;
    }
    
}
