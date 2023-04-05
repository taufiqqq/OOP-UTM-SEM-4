import java.lang.StackWalker.Option;
import java.util.Scanner;

public class CourseRegApp {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in); // Create a Scanner object
        int option = 0;

        // create 3 courses
        // ===========COURSES=============
        Course engClass;
        engClass = new Course("Academic Communication Skills", "ENG9090", 2);

        Course javaClass = new Course();
        javaClass.setCourseCode("SECJ2032");
        javaClass.setCredit(4);
        javaClass.setName("Object Oriented Programming");

        Course osClass = new Course("Operating System", "SECR0069", 3);

        Course listOfCourse[] = new Course[5];
        listOfCourse[0] = engClass;
        listOfCourse[1] = javaClass;
        listOfCourse[2] = osClass;

        // ========LECTURER===========
        Lecturer l1 = new Lecturer("Hazinah", "15501", "FC Networking");
        Lecturer l2 = new Lecturer("Khadijah", "10900", "FC Cyber Security");
        Lecturer l3 = new Lecturer("Ali", "13045", "English and Research");

        // ========STUDENT===========
        Student listOfStudent[] = new Student[100];
        listOfStudent[0] = new Student("Taufiq", "A21EC0095", 2002);
        listOfStudent[1] = new Student("Bilkis", "A20EC0012", 2001);
        listOfStudent[2] = new Student("Zie", "A21EC0209", 1999);
        listOfStudent[3] = new Student("Aisyah", "A21EC0900", 2000);
        listOfStudent[4] = new Student("Muhammad", "A20ET0675", 1998);
        listOfStudent[5] = new Student("Aaron", "A22EC0001", 2001);
        listOfStudent[6] = new Student("Brandon", "A21EM4509", 1997);
        listOfStudent[7] = new Student("Ching", "A22EA0022", 2003);
        listOfStudent[8] = new Student("Nur", "A19EE0059", 2000);

        while (option != 4) {

            System.out.println("\n<--- COURSE REGISTRATION APPLICATION --->\n");
            System.out.println("1. Student\n2. Lecturer\n3. Admin\n4.Exit");
            System.out.println("Enter Option");
            option = Integer.parseInt(keyboard.nextLine()); // Read user input

            switch (option) {
                case 1:
                    int optionStudent = 0;
                    String studentMatricNumber = null;
                    int studentIndex = 0;

                    System.out.println("Enter your matric number");
                    studentMatricNumber = keyboard.nextLine();
                    for (int i = 0; i < 100 && listOfStudent[i] != null; i++) {
                        if (listOfStudent[i].getMatNum() == studentMatricNumber) {
                            studentIndex = i;
                            break;
                        }
                    }
                    while (optionStudent != 4) {

                        System.out.println("\n<--- STUDENT --->");
                        System.out.println("1. Add Course\n2. Delete Course\n3. Course List\n4. Exit");
                        System.out.println("Enter Option");
                        optionStudent = Integer.parseInt(keyboard.nextLine());

                        switch (optionStudent) {
                            case 1:
                                int courseChoice = 0;

                                System.out.println("=== LIST OF COURSES (updated toString method)===");

                                for (int i = 0; i < 3; i++)
                                    System.out.println(i + 1 + ". " + listOfCourse[i].toString());

                                System.out.println("Enter Option");
                                courseChoice = Integer.parseInt(keyboard.nextLine());

                                if (courseChoice == 1) {
                                    listOfStudent[studentIndex].regCourse(listOfCourse[0]);
                                    engClass.addStudent(listOfStudent[studentIndex]);
                                } else if (courseChoice == 2) {
                                    listOfStudent[studentIndex].regCourse(listOfCourse[1]);
                                    javaClass.addStudent(listOfStudent[studentIndex]);
                                } else if (courseChoice == 3) {
                                    listOfStudent[studentIndex].regCourse(listOfCourse[2]);
                                    osClass.addStudent(listOfStudent[studentIndex]);
                                } else
                                    System.out.println("ERROR");
                                break;

                            case 2:
                                System.out.println("-- STILL IN PROGRESS ---");
                                break;

                            case 3:
                                listOfStudent[studentIndex].printCourses();
                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("Enter The Correct Option");
                                break;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter The Corrent Number Please");
            }
        }
        /*
         * System.out.println("=== LIST OF COURSES (updated toString method)===");
         * for (int i = 0; i < 3; i++) {
         * System.out.println(listOfCourse[i].toString());
         * }
         * 
         * System.out.println("\n=== LIST OF STAFF ===");
         * System.out.println(l1.getName() + ", " + l1.getStaffNum() + ", " +
         * l1.getDept());
         * System.out.println(l2.getName() + ", " + l1.getStaffNum() + ", " +
         * l2.getDept());
         * System.out.println(l3.getName() + ", " + l1.getStaffNum() + ", " +
         * l3.getDept());
         * 
         * //Inserting student into os class
         * s1.regCourse(osClass);
         * osClass.addStudent(s1);
         * s2.regCourse(engClass);
         * osClass.addStudent(s2);
         * s3.regCourse(osClass);
         * osClass.addStudent(s3);
         * s5.regCourse(osClass);
         * osClass.addStudent(s5);
         * s8.regCourse(osClass);
         * osClass.addStudent(s8);
         * 
         * //Inserting student into eng class
         * s2.regCourse(engClass);
         * engClass.addStudent(s2);
         * s3.regCourse(engClass);
         * engClass.addStudent(s3);
         * s5.regCourse(engClass);
         * engClass.addStudent(s5);
         * s6.regCourse(engClass);
         * engClass.addStudent(s6);
         * s7.regCourse(engClass);
         * engClass.addStudent(s7);
         * s9.regCourse(engClass);
         * engClass.addStudent(s9);
         * 
         * //Inserting students in java class
         * s3.regCourse(javaClass);
         * javaClass.addStudent(s3);
         * s4.regCourse(javaClass);
         * javaClass.addStudent(s4);
         * s4.regCourse(javaClass);
         * javaClass.addStudent(s4);
         * 
         * 
         * osClass.printStudents();
         * engClass.printStudents();
         * javaClass.printStudents();
         */
    }
}
