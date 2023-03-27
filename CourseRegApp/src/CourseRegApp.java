public class CourseRegApp {
    public static void main(String[] args) throws Exception {
        System.out.println("<--- Course Registration Application --->\n");

        // create 3 courses
        // ===========COURSES=============
        Course OOPSection5;
        OOPSection5 = new Course("Academic Communication Skills", "ENGL9090", 2);

        Course OOPSection6 = new Course();
        OOPSection6.setCourseCode("SECJ2032");
        OOPSection6.setCredit(4);
        OOPSection6.setName("Object Oriented Programming");

        Course OOPSection7 = new Course("Operating System", "SECR0069", 3);

        Course listOfCourse[] = new Course[3];
        // or
        // Course listOfCourse[];
        // listOfCourse = new Course[3];
        listOfCourse[0] = OOPSection5;
        listOfCourse[1] = OOPSection6;
        listOfCourse[2] = OOPSection7;

        // ========LECTURER===========
        Lecturer l1 = new Lecturer("Hazinah", "15501", "FC Networking");
        Lecturer l2 = new Lecturer("Khadijah", "10900", "FC Cyber Security");
        Lecturer l3 = new Lecturer("Ali", "13045", "English and Research");

        // ========LECTURER===========
        Student s1 = new Student("Taufiq", "A21EC0095", 2002);
        Student s2 = new Student("Bilkis", "A20EC0012", 2001);
        Student s3 = new Student("Zie", "A21EC0209", 1999);
        Student s4 = new Student("Aisyah", "A21EC0900", 2000);

        System.out.println("=== LIST OF COURSES (updated toString method)===");
        for (int i = 0; i < 3; i++) {
            System.out.println(listOfCourse[i].toString());
        }

        System.out.println("\n=== LIST OF STAFF ===");
        System.out.println(l1.getName() + ", " + l1.getStaffNum() + ", " + l1.getDept());
        System.out.println(l2.getName() + ", " + l1.getStaffNum() + ", " + l2.getDept());
        System.out.println(l3.getName() + ", " + l1.getStaffNum() + ", " + l3.getDept());

        s1.regCourse(OOPSection7);
        OOPSection7.addStudent(s1);

        s2.regCourse(OOPSection5);
        OOPSection5.addStudent(s2);

        s3.regCourse(OOPSection6);
        s4.regCourse(OOPSection6);
        OOPSection6.addStudent(s3);
        OOPSection6.addStudent(s4);

        System.out.println("\n=== STUDENT FROM OOP-6 ===");
        OOPSection6.printStudents();
    }
}
