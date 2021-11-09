package QuanLyBaiTapNhomFile;

public class Student {
    private String student_code, student_name, phone_number;
    public Student(String student_code, String student_name, String phone_number) {
        this.student_code = student_code;
        this.student_name = student_name;
        this.phone_number = phone_number;
    }

    public String getStudent_code() {
        return student_code;
    }

    @Override
    public String toString() {
        return student_code + " " + student_name + " " + phone_number;
    }

    
    
}
