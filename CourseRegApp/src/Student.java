public class Student {
    private String name;
    private String matNum;
    private int yob;
    private Course courseList[] = new Course[5];
    private int courseNum = 0;

    Student() {
        name = "";
        matNum = "";
        yob = 0;
    }

    Student(String name, String matNum, int yob) {
        this.name = name;
        this.matNum = matNum;
        this.yob = yob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMatNum(String matNum) {
        this.matNum = matNum;
    }

    public String getMatNum() {
        return matNum;
    }

    public void setYOB(int yob) {
        this.yob = yob;
    }

    public int getYOB() {
        return yob;
    }

    public void regCourse(Course c){
        courseList[courseNum] = c;
        courseNum++;
    }
    
}
