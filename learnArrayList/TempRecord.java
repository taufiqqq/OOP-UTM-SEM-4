
public class TempRecord {
    
private String name; 
private Float temperature;
private String remark;

public TempRecord(String name, Float temperature, String remark){
    this.name = name;
    this.temperature = temperature;
    this.remark = remark;
}

public Float getTemperature(){
    return temperature;
}
}
