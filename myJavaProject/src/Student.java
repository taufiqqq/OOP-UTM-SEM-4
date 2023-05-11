import java.util.ArrayList;

public class Student {
    private String name;
    // Course courseList[] = new Course[6];
    ArrayList<Course> courseList = new ArrayList<>();
    private int numSubj;

    public Student(String name) {
        this.name = name;
    }

    public void reg4Course(Course c) {
        if(numSubj < 6){
            courseList.add(c);
        }
        else{System.out.println("Already reached max subject");}
    }
}
