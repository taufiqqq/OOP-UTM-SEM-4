public class Burger {
    private final int SIZE = 15;
    private String code;
    private int quantity;
    private static int totalItem = 0;
    
    public Burger(String code, int quantity) {
        this.code = code;
        this.quantity = quantity;
        totalItem+=quantity;
    }

    public String getCode() {
        return code;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalItem() {
        return totalItem;
    }

}
