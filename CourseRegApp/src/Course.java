public class Course {

    private String name;
    private String courseCode;
    private int credit;
    private Student listOfStudent[] = new Student[30];
    private int studentNum = 0;
    private Lecturer lec;

    Course() {
        name = "";
        courseCode = "";
        credit = 0;
    }

    Course(String name, String courseCode, int credit) {
        this.name = name;
        this.courseCode = courseCode;
        this.credit = credit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    @Override

    public String toString() {
        return "Course: " + name + ", Code: " + courseCode + ", credit = " + credit;
    }

    public void addStudent(Student s) {
        if (studentNum < 30) {
            listOfStudent[studentNum] = s;
            studentNum++;
        }
        else {
            System.out.println("FULL");
        }
    }

    public void addLecturer(Lecturer l) {
        if (lec == null) {
            lec = l;
        }
        else {
            System.out.println("Lecturer already assigned");
        }
    }

    public void printStudents(){
        for(int i = 0; i<30; i++){
            if(listOfStudent[i] != null)
                System.out.println(listOfStudent[i].getName());
            else break;
        }
    }

}
