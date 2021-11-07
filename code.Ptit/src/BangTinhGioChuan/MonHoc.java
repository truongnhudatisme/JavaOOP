
package BangTinhGioChuan;

public class MonHoc {
    private String mamon, tenmon;

    public MonHoc(String mamon, String tenmon) {
        this.mamon = mamon;
        this.tenmon = tenmon;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    @Override
    public String toString() {
        return tenmon;
    }

    
}
