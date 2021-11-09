package TinhLuong;

public class Staff {
    private String staff_id,name;
    private int wage, num_of_works;
    private Department dep;
    private int coefficient;
    private long total;
    private int a[] = {10,10,10,12,12,12,12,12,14,14,14,14,14,14,14,20};
    private int b[] = {10,10,10,11,11,11,11,11,13,13,13,13,13,13,13,16};
    private int c[] = {9,9,9,10,10,10,10,10,12,12,12,12,12,12,12,14};
    private int d[] = {8,8,8,9,9,9,9,9,11,11,11,11,11,11,11,13};
    public Staff(String staff_id, String name, String wage, String num_of_works,Department dep) {
        this.staff_id = staff_id;
        this.name = name;
        this.wage = Integer.parseInt(wage);
        this.num_of_works =Integer.parseInt(num_of_works);
        this.dep = dep;
        solve();
    }

    public String getDepId(){
        return dep.getId();
    }
    private void solve(){
        if(staff_id.charAt(0) == 'A'){
            if(Integer.parseInt(staff_id.substring(1,3)) >= 16){
                coefficient = a[15];
            }
            else{
                coefficient = a[Integer.parseInt(staff_id.substring(1,3))-1];
            }
        }
        if(staff_id.charAt(0) == 'B'){
            if(Integer.parseInt(staff_id.substring(1,3)) >= 16){
                coefficient = b[15];
            }
            else{
                coefficient = b[Integer.parseInt(staff_id.substring(1,3))-1];
            }
        }
        if(staff_id.charAt(0) == 'C'){
            if(Integer.parseInt(staff_id.substring(1,3)) >= 16){
                coefficient = c[15];
            }
            else{
                coefficient = c[Integer.parseInt(staff_id.substring(1,3))-1];
            }
        }
        if(staff_id.charAt(0) == 'D'){
            if(Integer.parseInt(staff_id.substring(1,3)) >= 16){
                coefficient = d[15];
            }
            else{
                coefficient = d[Integer.parseInt(staff_id.substring(1,3))-1];
            }
        }
        total = (long) num_of_works*coefficient*wage*1000;
    }
    @Override
    public String toString() {
        return staff_id + " " + name + " " + dep.getName() + " " + total;
        // return staff_id + " " + name + " " + total;
    }
    
}
