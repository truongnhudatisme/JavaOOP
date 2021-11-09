package QuanLyBaiTapNhomFile;

public class Group implements Comparable<Group> {
    private Student stu;
    private Exercise exe;
    // private int group_id;

    public Group(Student stu, Exercise exe) {
        this.stu = stu;
        this.exe = exe;
    }
    @Override
    public String toString() {
        return stu + " " + exe.getExe_code() + " " + exe;
    }
    @Override
    public int compareTo(Group o) {
        if(this.stu.getStudent_code().compareTo(o.stu.getStudent_code()) < 0)
            return -1;
        else
            return 1;
    }
    
}
