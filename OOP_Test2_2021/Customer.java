import java.io.FileReader;
import java.util.Vector;

public class Customer {
    private String paymentMethod;
    private Name name;
    private Address add;
    private Vector<Pizza> pizzaList = new Vector<>();
    private final double DELIVERY_CHARGE = 5;

    public Customer(String paymentMethod, String firstName, String lastName, Address add) {
        this.paymentMethod = paymentMethod;
        name = new Name(firstName, lastName);
        this.add = add;
    }

    public void order(Pizza p) {
        pizzaList.add(p);
    }

    public void display() {
        System.out.println();
        System.out.println(name);
        System.out.println(add);
        System.out.println("Number of ordered pizza: " + pizzaList.size());
        double tempPrice = 0;
        for (int i = 0; i < pizzaList.size(); i++) {
            System.out.printf("%d)   %-15s%-10sRM%.2f\n", i+1, pizzaList.get(i).getDescription(), pizzaList.get(i).getPizzaSize().getSize(), pizzaList.get(i).getPizzaSize().getPrice());
            tempPrice += pizzaList.get(i).getPizzaSize().getPrice();
        }
        System.out.println("Total Price = " + tempPrice);
        if (paymentMethod.equals("ONLINE")) {
            tempPrice = 0.9 * tempPrice;
        }
        System.out.println("Price after discount = " + tempPrice);
        tempPrice += DELIVERY_CHARGE;
        System.out.println("Total Charge = " + tempPrice);
        System.out.println();

    }
}
