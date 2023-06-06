
public class Cuboid extends StraightObject{

    @Override
    public double getSurfaceArea() {
        area = 2*(length*height+width*height+width*length);
        return area;
    }

    @Override
    public double getVolume() {
        volume = length*height*width;
        return volume;
    }
    
}
