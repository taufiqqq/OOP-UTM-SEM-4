//Muhammad Taufiq bin Jurimi A21EC0095

public class TestDepreciation {
    public static void displayInfo(UsedCar obj) {
        System.out.println("\n\nModel: " + obj.getModel() + "\nRate of depreciation: "
                + obj.getRateDepreciation() + "\nPurchase Price: " + obj.getBasicPrice() + "\nTotal depreciation: "
                + obj.calcDepreciationCost());
    }

    public static void main(String[] args) throws Exception {
        UsedCar c1 = new UsedCar("Toyota", 0.35, 75000);
        UsedCar c2 = new UsedCar("Kia", 0.5, 100000);
        displayInfo(c1);
        displayInfo(c2);
    }
}
