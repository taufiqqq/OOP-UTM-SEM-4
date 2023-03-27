
public class Lecturer {
    private String name;
    private String staffNum;
    private String dept;
    private Course courseList[];
    private int courseNum = 0;

    Lecturer() {
        name = "";
        staffNum = "";
        dept = "";
    }

    Lecturer(String name, String staffNum, String dept) {
        this.name = name;
        this.staffNum = staffNum;
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
    }

    public String getStaffNum() {
        return staffNum;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    
    public void regCourse(Course c){
        courseList[courseNum] = c;
        courseNum++;
    }

}
