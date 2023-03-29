public class CourseRegApp {
    public static void main(String[] args) throws Exception {
        System.out.println("<--- Course Registration Application --->\n");

        // create 3 courses
        // ===========COURSES=============
        Course engClass;
        engClass = new Course("Academic Communication Skills", "ENGL9090", 2);

        Course javaClass = new Course();
        javaClass.setCourseCode("SECJ2032");
        javaClass.setCredit(4);
        javaClass.setName("Object Oriented Programming");

        Course osClass = new Course("Operating System", "SECR0069", 3);

        Course listOfCourse[] = new Course[3];
        // or
        // Course listOfCourse[];
        // listOfCourse = new Course[3];
        listOfCourse[0] = engClass;
        listOfCourse[1] = javaClass;
        listOfCourse[2] = osClass;

        // ========LECTURER===========
        Lecturer l1 = new Lecturer("Hazinah", "15501", "FC Networking");
        Lecturer l2 = new Lecturer("Khadijah", "10900", "FC Cyber Security");
        Lecturer l3 = new Lecturer("Ali", "13045", "English and Research");

        // ========LECTURER===========
        Student s1 = new Student("Taufiq", "A21EC0095", 2002);
        Student s2 = new Student("Bilkis", "A20EC0012", 2001);
        Student s3 = new Student("Zie", "A21EC0209", 1999);
        Student s4 = new Student("Aisyah", "A21EC0900", 2000);
        Student s5 = new Student("Muhammad", "A20ET0675", 1998);
        Student s6 = new Student("Aaron", "A22EC0001", 2001);
        Student s7 = new Student("Brandon", "A21EM4509", 1997);
        Student s8 = new Student("Ching", "A22EA0022", 2003);
        Student s9 = new Student("Nur", "A19EE0059", 2000);
        
        System.out.println("=== LIST OF COURSES (updated toString method)===");
        for (int i = 0; i < 3; i++) {
            System.out.println(listOfCourse[i].toString());
        }

        System.out.println("\n=== LIST OF STAFF ===");
        System.out.println(l1.getName() + ", " + l1.getStaffNum() + ", " + l1.getDept());
        System.out.println(l2.getName() + ", " + l1.getStaffNum() + ", " + l2.getDept());
        System.out.println(l3.getName() + ", " + l1.getStaffNum() + ", " + l3.getDept());

        //Inserting student into os class
        s1.regCourse(osClass);
        osClass.addStudent(s1);
        s2.regCourse(engClass);
        osClass.addStudent(s2);
        s3.regCourse(osClass);
        osClass.addStudent(s3);
        s5.regCourse(osClass);
        osClass.addStudent(s5);
        s8.regCourse(osClass);
        osClass.addStudent(s8);

        //Inserting student into eng class
        s2.regCourse(engClass);
        engClass.addStudent(s2);
        s3.regCourse(engClass);
        engClass.addStudent(s3);
        s5.regCourse(engClass);
        engClass.addStudent(s5);
        s6.regCourse(engClass);
        engClass.addStudent(s6);
        s7.regCourse(engClass);
        engClass.addStudent(s7);
        s9.regCourse(engClass);
        engClass.addStudent(s9);

        //Inserting students in java class
        s3.regCourse(javaClass);
        javaClass.addStudent(s3);
        s4.regCourse(javaClass);
        javaClass.addStudent(s4);
        s4.regCourse(javaClass);
        javaClass.addStudent(s4);
        

        osClass.printStudents();
        engClass.printStudents();
        javaClass.printStudents();

    }
}
