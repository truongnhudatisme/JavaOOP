package TinhCuocDienThoaiCoDinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CallDetails implements Comparable<CallDetails> {
    private City city;
    private String phoneNumber;
    private Date timeStart, timeFinish;
    private int timeUse;
    private int total;
    public CallDetails(String phoneNumber, String timeStart, String timeFinish, City city) throws ParseException {
        this.phoneNumber = phoneNumber;
        this.timeStart = new SimpleDateFormat("HH:mm").parse(timeStart);
        this.timeFinish = new SimpleDateFormat("HH:mm").parse(timeFinish);
        this.city = city;
        solve();
    }
    public CallDetails(String phoneNumber, String timeStart, String timeFinish) throws ParseException {
        this.phoneNumber = phoneNumber;
        this.timeStart = new SimpleDateFormat("HH:mm").parse(timeStart);
        this.timeFinish = new SimpleDateFormat("HH:mm").parse(timeFinish);
        solve();
    }
    private void solve(){
        if(phoneNumber.charAt(0) != '0'){
            city = new City("0","Noi mang","800");
            long diff = timeFinish.getTime() - timeStart.getTime();
            long diffMinutes = diff / (60 * 1000);
            timeUse = (int) Math.ceil((double) diffMinutes/3);
            total = timeUse*city.getFee();
        }
        else{
            long diff = timeFinish.getTime() - timeStart.getTime();
            timeUse =(int) diff / (60 * 1000);

            total = city.getFee()*timeUse;
        }
    }
    @Override
    public String toString() {
        return phoneNumber + " " + city + " " + timeUse + " " + total;
    }
    @Override
    public int compareTo(CallDetails o) {
        if(this.total < o.total)
            return 1;
        else
            return -1;
    }
    
}
