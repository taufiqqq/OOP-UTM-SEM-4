import java.util.Scanner;

public class AppArray2D {

    public static void main(String[] args) {
        // coursemark ==> quiz1(5m) quiz2(5m) test1(20m) labtest(20m) assg(10m) :
        // total(60m)
        // double[] courseMark = new double[5];
        // double[] courseMark = { 4.5, 4.0, 16.5, 15.0, 7.5 };

        // double[][] cmas = new double[3][5];
        double[][] cmas = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

        /*
         * cmas[0][0] = 4.5;
         * cmas[0][1] = 4.0;
         * cmas[0][2] = 3.5;
         * cmas[0][3] = 3.0;
         * cmas[0][3] = 2.5;
         * cmas[1][0] = 1.0;
         * cmas[1][1] = 1.1;
         * cmas[1][2] = 1.2;
         * cmas[1][3] = 1.3;
         * cmas[1][3] = 1.4;
         * cmas[2][0] = 3.1;
         * cmas[2][1] = 3.2;
         * cmas[2][2] = 3.3;
         * cmas[2][3] = 3.4;
         * cmas[2][3] = 3.5;
         */
        System.out.println("CourseMarkAllStud: " + cmas);
        System.out.println("CourseMarkAllStud: " + cmas[0]);
        System.out.println("CourseMarkAllStud: " + cmas[0][0]);

        System.out.println("\nAll Element: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cmas[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nAll Element: ");
        for (double cmasArray[] : cmas) {
            for (double cm : cmasArray) {
                System.out.print(cm + "   ");
            }
            System.out.println();
        }

        Scanner s = new Scanner(System.in);

        System.out.println("\nYour input: ");
        for (int i = 0; i < cmas.length; i++) {
            for (int j = 0; j < cmas[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] - ");
                cmas[i][j] = s.nextDouble();
            }
        }

        System.out.println("\nAll Element: ");
        for (double cmasArray[] : cmas) {
            for (double cm : cmasArray) {
                System.out.print(cm + "   ");
            }
            System.out.println();
        }

        double sum[] = { 0, 0, 0 };
        double largest = 0;
        int position = 0;
        System.out.println("\nSum of Mark: ");
        for (int i = 0; i < cmas.length; i++) {
            for (int j = 0; j < cmas[i].length; j++) {
                sum[i] += cmas[i][j];
            }
            if (sum[i] > largest) {
                largest = sum[i];
                position = i;

            }
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Student " + (i + 1) + " sum is : " + sum[i]);
        }
        System.out.println("\nStudent " + (position + 1) + " has the highest mark (" + largest + ")");
        s.close();
        /*
         * for (double cm : courseMark) {
         * System.out.println(cm);
         * }
         */
    }
}
