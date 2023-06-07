import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class UI {

    public int getUserSelection(Scanner sc) { // kalau throw atas ni, maksudnya yang panggil
                                              // nanti kena handle ah, contoh throws IOException
        int selection = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                System.out.println("PLEASE ENTER SELECTION 1 to 4");
                selection = Integer.parseInt(input.readLine()); // readline error
                selection = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
                System.out.println("Invalid input format my G...");
                // throw ioe; //rosak terus code
            } catch (IOException ioe) {
                ioe.printStackTrace();
                System.out.println("Error IOException");
            } catch (Exception ex) { // this will catch everything. general kena bawah, kalau exception ni kat atas,
                                     // nanti dia catch, bawah nak catch apa pulak en
                ex.printStackTrace();
                System.out.println("Error IOException");
            } finally {
                System.out.println("Your selection is: " + selection);
                System.out.println("Statement inside {finally} block execute");
            }
            System.out.println("Last sentence");
        } while (selection < 1 || selection > 4); // (selection != 1 || selection != 2 || selection != 3 || selection
                                                  // != 4);
        return selection;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        UI ui = new UI();
        int selection = 0;
        selection = ui.getUserSelection(sc);
        System.out.println("Your input is " + selection);

    }
}
