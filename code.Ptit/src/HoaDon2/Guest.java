package HoaDon2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Guest {
    private String guest_code,name, sex, add;
    private Date dob;
    private static int serial = 1;
    public Guest(String name, String sex, String dob,String add) throws ParseException {
        this.guest_code = "KH" + String.format("%03d",Guest.serial++);
        this.name = name;
        this.sex = sex;
        this.add = add;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }

    public String getGuest_code() {
        return guest_code;
    }

    @Override
    public String toString() {
        return name + " " + add;
    }
    
}

