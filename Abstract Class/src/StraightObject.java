import java.util.Scanner;

abstract public class StraightObject extends GeometricObject {
    protected double height;
    protected double width;
    protected double length;

    public StraightObject(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter: ");
        
        System.out.print("Length: ");
        length = s.nextDouble();
        System.out.print("Width: ");
        width = s.nextDouble();
        System.out.print("Height: ");
        height = s.nextDouble();

    }

}
