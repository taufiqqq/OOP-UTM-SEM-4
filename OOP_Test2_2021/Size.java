public enum Size {
    S(10, "Small"), 
    R(15, "Regular"), 
    L(25, "Large");

    private double price;
    private String saiz;

    Size(double price, String saiz){
        this.price = price;
        this.saiz = saiz;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return saiz;
    }    
}
