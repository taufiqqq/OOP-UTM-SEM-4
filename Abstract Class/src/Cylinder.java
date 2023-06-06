import java.util.Scanner;

public class Cylinder extends CurvyObject{
    protected double height;
    
    public Cylinder(){
        Scanner s = new Scanner(System.in);
        System.out.print("Height: ");
        height = s.nextDouble();
     
    }
    @Override
    public double getSurfaceArea() {
        area = 2*PI*radius*height + 2*PI*radius*radius;
        return area; 
    }
    
    @Override
    public double getVolume() {
        volume = PI*radius*radius*height;
        return volume;
    }
    
}
