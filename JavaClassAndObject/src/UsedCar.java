public class UsedCar {
    private String model;
    private double rateDepreciation;
    private double basicPrice;

    public UsedCar() {
        model = "";
        rateDepreciation = 0;
        basicPrice = 0.0;
    }

    public UsedCar(String model, double rateDepreciation, double basicPrice) {
        this.model = model;
        this.rateDepreciation = rateDepreciation;
        this.basicPrice = basicPrice;
    }

    public String getModel() {
        return model;
    }

    public double getRateDepreciation() {
        return rateDepreciation;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public double calcDepreciationCost() {
        return basicPrice*rateDepreciation;
    }
}
