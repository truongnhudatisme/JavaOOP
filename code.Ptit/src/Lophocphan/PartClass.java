package Lophocphan;

public class PartClass implements Comparable<PartClass> {
    private String subject_code, subject_name, group, instructor_name;

    public PartClass(String subject_code, String subject_name, String group, String instructor_name) {
        this.subject_code = subject_code;
        this.subject_name = subject_name;
        this.group = group;
        this.instructor_name = instructor_name;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public String getInstructor_name() {
        return instructor_name;
    }


    public String getSubject_name() {
        return subject_name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        // return group + " " + instructor_name;
        return subject_code + " " + subject_name + " " + group;
    }

    @Override
    public int compareTo(PartClass o) {
        if(this.subject_code.compareTo(o.subject_code) < 0)
            return -1;
        else if(this.subject_code.compareTo(o.subject_code) == 0){
            if(this.group.compareTo(o.group) < 0){
                return -1;
            }
            else{
                return 1;
            }
        }
        else{
            return 1;
        }
    }

    
}
