import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class StudentResults {
    public static void main(String[] args) throws Exception {
        String matNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXAMINATION RESULT SLIP SYSTEM\n");
        System.out.print("Enter student's matric number: ");
        matNum = scanner.nextLine();
        scanner.close();

        File file = new File("Slip" + matNum + ".txt"); // txt file will be generated in project file (TEST1819)
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Student student1 = new Student();

        bufferedWriter.write("EXAMINATION RESULTS FOR SEM 2, 2018/2019\n\n");

        try {
            double result = 0;       //calculate total grade point * credit, for GPA later
            String tempName = "";    //get student name from first line of file
            
            File inputFile = new File("src/" + matNum + ".txt");
            Scanner s = new Scanner(inputFile);

            if (s.hasNextLine())
                tempName = s.nextLine();

            student1.setName(tempName);
            student1.setMatricNumber(matNum);

            bufferedWriter.write("Name      : " + student1.getName() + "\n");
            bufferedWriter.write("Matric No : " + student1.getMatricNumber() + "\n\n");
            bufferedWriter.write("CODE         COURSE                                    CREDIT    GRADE\n");
            bufferedWriter.write("======================================================================\n");

            while (s.hasNext()) {
                char tempResult = s.next().charAt(0);
                String tempCourseCode = s.next();

                Course c = Course.valueOf(tempCourseCode);
                c.setGrade(tempResult);
                student1.setTotalCredit(c.getCredit());

                result += c.getGradeValue() * c.getCredit();

                bufferedWriter.write(tempCourseCode + "      ");
                bufferedWriter.write(String.format("%-33s", c.getDescription())); // Adjust the width as needed
                bufferedWriter.write(String.format("%10d", c.getCredit())); // Use %d for integers
                bufferedWriter.write(String.format("%10s%n", tempResult));
            }
            student1.setGPA(result / student1.getTotalCredit());
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        bufferedWriter.write("======================================================================\n");
        bufferedWriter.write("Credit Earned : " + student1.getTotalCredit() + "\n");
        bufferedWriter.write(String.format("GPA           : %.2f%n", student1.getGPA()));

        bufferedWriter.close();
        System.out.println("Examination Slip is generated...");
    }
}
