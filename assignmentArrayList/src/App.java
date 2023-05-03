import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("Option 1 : Vector Exercise\nOption 2 : Array List");
        System.out.print("Insert Choice: ");
        int option = Integer.parseInt(s.nextLine());

        ArrayList<Float> temp = new ArrayList<>();
        temp.add(Float.valueOf(12.1f));
        temp.add(3.2f); // try normal float
        temp.add(Float.valueOf(13f));
        temp.add(Float.valueOf(45f));
        temp.add(Float.valueOf(33.5f));
        temp.add(Float.valueOf(17.1f));
        temp.add(Float.valueOf(38.9f));
        temp.add(Float.valueOf(44.45f));
        temp.add(Float.valueOf(41.2f));
        temp.add(Float.valueOf(29f));
        temp.add(Float.valueOf(4.5f));
        temp.add(Float.valueOf(6.55f));
        temp.add(Float.valueOf(23.3f));
        temp.add(Float.valueOf(39.44f));
        temp.add(Float.valueOf(1.7f));

        if (option == 1) {
            System.out.println("\nSize of Array: " +temp.size());
            System.out.println("Element in Array: " +temp);
    
            float avg = 0, highest = temp.get(0), lowest = temp.get(0);

            for (float t : temp) {
                avg += t;
            }
            avg = avg / 15;

            for (int i = 0; i < 15; i++) {
                if (temp.get(i) > highest)
                    highest = temp.get(i);

                if (temp.get(i) < lowest)
                    lowest = temp.get(i);
            }

            System.out.println("AVG : " + avg + ", HIGHEST = " + highest + " , LOWEST : " + lowest);

            //sorting
            Collections.sort(temp);
            System.out.println("\nSorted array : " +temp);
            System.out.println("AVG : " + avg + " , LOWEST : " + temp.get(0) + ", HIGHEST = " + temp.get(14));

        } else {
            ArrayList<TempRecord> aList = new ArrayList<>();
            aList.add(new TempRecord("Johor Bahru", 12.1, "Below Average"));
            aList.add(new TempRecord("Kluang", 3.2, "Ice Cold"));
            aList.add(new TempRecord("Kulai", 13, "Below Average"));
            aList.add(new TempRecord("Mersing", 45, "Blazing Hot"));
            aList.add(new TempRecord("Batu Pahat", 33.6, "Hot"));
            aList.add(new TempRecord("Miri", 17.1, "Cool"));
            aList.add(new TempRecord("Jasin", 39, "Hot"));
            aList.add(new TempRecord("Muar", 41.2, "Blazing Hot"));
            aList.add(new TempRecord("Ampang", 40.7, "Blazing Hot"));
            aList.add(new TempRecord("Pontian", 29, "Average"));
            aList.add(new TempRecord("Pasir Gudang", 4.5, "Cold"));
            aList.add(new TempRecord("Pengkalan Chepa", 6.5, "Cold"));
            aList.add(new TempRecord("Pasir Mas", 23.3, "Average"));
            aList.add(new TempRecord("Dan Nok", 39,"Hot"));
            aList.add(new TempRecord("Osaka", 0.12, "Cold"));

            //Update Johor Bahru remark
            aList.get(0).setRemark("Cool");

            //Find Highest and lowest
            //This one, I use index to track the position for highest/lowest position
            int highest = 0, lowest = 0;
            for (int i = 0; i < 15; i++) {
                if ( aList.get(i).getTemperature() > aList.get(highest).getTemperature())
                    highest = i;

                if ( aList.get(i).getTemperature() < aList.get(lowest).getTemperature())
                    lowest = i;
            }

            aList.get(lowest).setRemark("Lowest Temperature Recorded");
            aList.get(highest).setRemark("Highest Temperature Recorded");

            for (TempRecord t : aList) {
                System.out.println(t.getName() + " -- " + t.getTemperature() + " Celcius -- " + t.getRemark());
            }

        }
        s.close();
    }
}
