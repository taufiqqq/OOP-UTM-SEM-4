public class Course {

    private String name;
    private String courseCode;
    private int credit;
    private Student listOfStudent[];
    private int studentNum;
    final int MAX = 30;
    private Lecturer lec;

    public Course() {
        name = "";
        courseCode = "";
        credit = 0;
        listOfStudent = new Student[MAX];
        studentNum = 0;
    }

    public Course(String name, String courseCode, int credit) {
        this.name = name;
        this.courseCode = courseCode;
        this.credit = credit;
        listOfStudent = new Student[MAX];
        this.studentNum = 0;
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
        int status = 0; // 0 if the student hasnt registered, 1/any other number if already registered

        if (studentNum < MAX) {
            for (int i = 0; i < studentNum; i++) {
                if (s.getMatNum() == listOfStudent[i].getMatNum())
                    status = 1; // indicates that student already registered. therefore wont be adding the
                                // student into the array
            }
            if (status == 0)
            {
                listOfStudent[studentNum] = s;
                studentNum++;
            }
        } else
            System.out.println("FULL");

    }

    public void addLecturer(Lecturer l) {
        if (lec == null) {
            lec = l;
        } else {
            System.out.println("Lecturer already assigned");
        }
    }

    public void printStudents() {
        System.out.println("\n=== STUDENT FROM CLASS " + this.name.toUpperCase() + " ===");
        for (int i = 0; i < MAX; i++) {
            if (listOfStudent[i] != null)
                System.out.println(i + 1 + ". " + listOfStudent[i].getName());
            else
                break;
        }
    }

}
