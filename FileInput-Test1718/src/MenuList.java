public enum MenuList {
    B101(8.9, "McChicken"),
    B102(8.9, "Fillet-O-Fish"), 
    B103(5.5, "Cheeseburger"), 
    B201(11.5, "Chicken McNuggets"), 
    B202(12.5, "GCB"), 
    B203(11.5, "Spicy Chicken McDeluxe"), 
    B204(10.9, "Big Mac"), 
    B301(18.2, "Double GCB"), 
    B302(11.95, "Double Fillet-O-Fish"), 
    B303(9.5, "Double Cheeseburger"), 
    B304(17.25, "Double Spicy Chicken McDeluxe");

    double price;
    String desc;

    MenuList(double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    
}
