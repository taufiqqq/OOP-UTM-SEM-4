import java.util.Scanner;

abstract public class CurvyObject extends GeometricObject {
    protected double radius;
    protected final double PI = 3.142;

    public CurvyObject() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter: ");

        System.out.print("Radius: ");
        radius = s.nextDouble();
    }

}
