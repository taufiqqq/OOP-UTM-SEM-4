import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DailyReport {
    public static void main(String[] args) throws Exception {

        Burger[] order = new Burger[11];
        int totalOrder = 11;
        double totalPrice = 0;

        try {
            File inputFile = new File("src/input.txt");
            Scanner s = new Scanner(inputFile);

            for (int i = 0; i < 15; i++) {
                if (s.hasNext()) {
                    String tempdesc = s.next();
                    int tempQuantity = s.nextInt();

                    order[i] = new Burger(tempdesc, tempQuantity);
                }
            }
            s.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println( "                             ABC BURGER DAILY SALES REPORT                                \n");
        System.out.println( "NUM  CODE     DESCRIPTION                       PRICE (RM)    QUANTITY   TOTAL PRICE (RM)");

        for (int i = 0; i < totalOrder; i++) {
            MenuList menu = MenuList.valueOf(order[i].getCode());
            double tempPrice = menu.getPrice() * order[i].getQuantity();

            // does not achieve the format
            /* System.out.println(i+1 + "\t" + order[i].getCode() + " " + menu.getDesc() + "\t\t\t\t" + menu.getPrice() + "\t\t" + order[i].getQuantity() + "\t" + tempPrice);
             */
            System.out.printf("%-4d %-8s %-30s %11.2f %10d %15.2f%n", i+1, order[i].getCode(), menu.getDesc(), menu.getPrice(), order[i].getQuantity(), tempPrice);
            totalPrice+=tempPrice;
        }

        System.out.println();
        System.out.println( "                       Total Items Sold = " + order[totalOrder-1].getTotalItem() + " burger(s)");
        System.out.println( "                       Total Income     = RM " + totalPrice);

    }
}
