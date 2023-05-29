
public class Sphere extends CurvyObject {

    public Sphere(){
    }

    @Override
    public double getSurfaceArea() {
        area = 4 * PI * radius * radius;
        return area;
    }

    @Override
    public double getVolume() {
        volume = 4 / 3 * PI * radius * radius * radius;
        return volume;
    }

}
