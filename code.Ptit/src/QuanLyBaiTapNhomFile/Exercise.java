package QuanLyBaiTapNhomFile;

public class Exercise {
    private String name;
    private int exe_code;
    private static int serial = 1;
    public Exercise(String name) {
        this.name = name;
        this.exe_code = Exercise.serial++;
    }
    
    public int getExe_code() {
        return exe_code;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
