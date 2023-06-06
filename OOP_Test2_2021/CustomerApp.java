import java.util.Vector;
import java.util.Scanner;

public class CustomerApp {

	public static void main(String[] args) {

		Vector<Customer> cus = new Vector<>();
		Scanner s = new Scanner(System.in);
		int choice = 0;
do{
		displayMenu();
		choice = s.nextInt();
		s.nextLine();
		
		switch (choice) {
			case 1:
			System.out.println("***** Add Customer *****");
			System.out.print("First Name: ");
			String firstName = s.nextLine();
			System.out.print("Last Name: ");
			String lastName = s.nextLine();
			System.out.print("Address:\n   Street: ");
			String street = s.nextLine();
			System.out.print("   City: ");
			String city = s.nextLine();
			System.out.print("Payment [Online | COD] : ");
			String payment = s.nextLine().toUpperCase();
			System.out.print("Number of pizzas: ");
			int pizzaNum = s.nextInt();
			s.nextLine();
			Address address = new Address(street, city);
			Customer tempCus = new Customer(payment, firstName, lastName, address);
			
			for(int i = 0; i<pizzaNum; i++){
				System.out.println("Pizza #" + (i+1) + ":");
				System.out.print("   Description: ");
				String description = s.nextLine();
				System.out.print("   Size [S-Small, R-Regular, L-Large]: ");
				String size = s.nextLine();
				Pizza pizza = new Pizza(description, size);
				tempCus.order(pizza);
			}

			cus.add(tempCus);
				break;
			case 2:
			System.out.println("***** List of Customer *****");
			for(int i = 0; i<cus.size(); i++){
				cus.get(i).display();
			}
				break;
			case 3:
			System.exit(0);
				break;
			default:
			System.out.println("bebal type 1 ngan 2 pun susah");
				break;

		}
	}while(choice!=3);

	}


	public static void displayMenu() {
		System.out.println("------------------------------------------");
		System.out.println("     Pizza Delivery Ordering System");
		System.out.println("------------------------------------------");
		System.out.println("[1] Add Customer");
		System.out.println("[2] Display Customers");
		System.out.println("[3] Exit");
		System.out.print("Your choice: ");
	}
}