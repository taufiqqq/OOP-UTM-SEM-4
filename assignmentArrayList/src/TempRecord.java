
public class TempRecord {

    private String name;
    private double temperature;
    private String remark;

    public TempRecord(String name, double temperature, String remark) {
        this.name = name;
        this.temperature = temperature;
        this.remark = remark;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
