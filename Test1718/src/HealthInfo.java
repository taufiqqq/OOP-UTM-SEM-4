public class HealthInfo {
    private int height;
    private int weight;
    private double bmi;

    public HealthInfo(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void calcBMI(){
        bmi = (double)weight/(((double)height/100)*((double)height/100));
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getBmi() {
        calcBMI();
        return bmi;
    }

    

    
}
