import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int yob = Integer.parseInt(reader.readLine());

        /*
         * create object p1, from class Person, by calling a constructor and pass 4
         * parameter that match the constructor signature
         */
        Person p1 = new Person(name, yob, 0f, 0f);
        System.out.println(p1.toString());
        
        Person p2 = new Person("Sam", 2002, 60f, 165f);
        System.out.println(p2.toString());
        
    }
}
