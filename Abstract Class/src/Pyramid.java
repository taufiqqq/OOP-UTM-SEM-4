
public class Pyramid extends StraightObject{

    public Pyramid(){
        super();
    }

    @Override
    public double getSurfaceArea() {
        area = (length*width)+4*(length*height/2);
        return area;
    }
    
    @Override
    public double getVolume() {
        volume =  (length*width)*height/3;
        return volume;
    }
    
}
