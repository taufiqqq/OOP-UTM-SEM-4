public class Student {
    private String name;
    private String matNum;
    private int yob;
    final int MAX = 5;
    private Course courseList[] = new Course[MAX];
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

    public void regCourse(Course c) {
        int status = 0; // 0 if the student hasnt registered, 1/any other number if already registered

        if (courseNum < MAX) {
            for (int i = 0; courseList[i]!=null && i < MAX; i++) {
                if (c.getCourseCode() == courseList[i].getCourseCode()) {
                    status = 1; // indicates that course already registered. therefore wont be adding the
                                // course into the array
                    System.out.println("ALREADY IN");
                }
            }
            if (status == 0) {
                courseList[courseNum] = c;
                courseNum++;
            }
        }
    }

    public void printCourses() {
        System.out.println("\n=== YOUR COURSES " + this.name.toUpperCase() + " ===");
        for (int i = 0; i < 5; i++) {
            if (courseList[i] != null)
                System.out.println(i + 1 + ". " + courseList[i].getName());
            else
                break;
        }
    }

}
