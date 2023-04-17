/* NAME: MUHAMMAD TAUFIQ BIN JURIMI
MATRIC NUM: A21EC0095
OOP INDIVIDUAL ASSIGNMENT 
17 APRIL 2023 */

import java.util.Scanner;

public class App {
    enum Vehicle {
        MOTORCYCLE, SEDAN_CAR, MPV_CAR, VAN;

        int price;
    };

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        Vehicle v;

        System.out.println("1. MOTORCYCLE");
        System.out.println("2. SEDAN CAR");
        System.out.println("3. MPV CAR");
        System.out.println("4. VAN");
        System.out.print("   Enter the choice :- ");
        choice = s.nextInt();
        System.out.println();

        switch (choice) {

            case 1:
                v = Vehicle.MOTORCYCLE;
                v.price = 1;
                System.out.println(v + "  RM1.00 per hour");
                getFee(v.price);
                break;
            case 2:
                v = Vehicle.SEDAN_CAR;
                v.price = 2;
                System.out.println(v + "  RM2.00 per hour");
                getFee(v.price);
                break;
            case 3:
                v = Vehicle.MPV_CAR;
                v.price = 3;
                System.out.println(v + "  RM3.00 per hour");
                getFee(v.price);
                break;
            case 4:
                v = Vehicle.VAN;
                v.price = 3;
                System.out.println(v + "  RM3.00 per hour");
                getFee(v.price);
                break;
            default:
                System.out.println("Wrong choice, exiting.... Thank you");
                System.exit(0);
        }

        s.close();

    }

    public static void getFee(int price) {
        Scanner s = new Scanner(System.in);
        int hour = 0;
        System.out.print("Enter parking hours :- ");
        hour = s.nextInt();
        System.out.println("\nYour Total Payment for Parking Fee is = RM" + (price * hour));
        System.out.println("Please pay at the counter/tag your card, Thank You");
        s.close();

    }
}
