import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        Student s1 = new Student("ali", "A21EC", 'M');
        Student s2 = new Student("abu", "A19EE", 'F');
        Student s3 = new Student("tila", "A22EM", 'F');
        s3.setName("sahibul");

        Student[] sList = new Student[4];

        sList[0] = s3;
        sList[1] = s2;
        sList[2] = s1;
        sList[3] = new Student("SIM", "AC110", 'M');
        // Student st[] = {new Student("ali", "A21EC", 'M'), new Student("abu", "A19EE",'F'), new Student("tila", "A22EM", 'F')};

        System.out.println(sList[0].toString());
        System.out.println(s3.toString());

        s.close();
    }
}
