// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Float> temp = new ArrayList<>();
        temp.add(Float.valueOf(12.1f));
        temp.add(3.2f); //try normal float
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
        
        System.out.println(temp);
        System.out.println(temp.size());
        
        float avg = 0, highest = temp.get(0), lowest = temp.get(0);
        
        for (float t : temp){
            avg+=t;
        }
        avg = avg/15;
        
        for(int i = 0; i<15 ; i++){
            if(temp.get(i)>highest)
            highest = temp.get(i);
            
            
            if(temp.get(i)<lowest)
            lowest = temp.get(i);
        }
    
        System.out.println("AVG : " + avg + ", HIGHEST = " + highest + " , LOWEST : " + lowest);
        
        ArrayList<TempRecord> aList = new ArrayList<>();
        //TempRecord[] record = new TempRecord[15];
        aList.add(new TempRecord( "Johor Bahru",temp.get(0), "Below Average"));
        aList.add(new TempRecord( "Kluang",temp.get(1), "Ice Cold"));
        aList.add(new TempRecord( "Kulai",temp.get(2), "Below Average"));
        aList.add(new TempRecord( "Mersing",temp.get(3), "Blazing Hot"));
        aList.add(new TempRecord( "Batu Pahat",temp.get(4), "Hot"));
        aList.add(new TempRecord( "Miri",temp.get(5), "Cool"));
        aList.add(new TempRecord( "Jasin",temp.get(6), "Hot"));
        aList.add(new TempRecord( "Muar",temp.get(7), "Blazing Hot"));
        aList.add(new TempRecord( "Ampang",temp.get(8), "Blazing Hot"));
        aList.add(new TempRecord( "Pontian",temp.get(9), "Average"));
        aList.add(new TempRecord( "Pasir Gudang",temp.get(10), "Cold"));
        aList.add(new TempRecord( "Pengkalan Chepa",temp.get(11), "Cold"));
        aList.add(new TempRecord( "Pasir Mas",temp.get(12), "Average"));
        aList.add(new TempRecord( "Dan Nok",temp.get(13), "Hot"));
        aList.add(new TempRecord( "Osaka",temp.get(14), "Cold"));
        
        for (TempRecord t : aList){
            System.out.print(t.getTemperature()  + ", ");
        }
        System.out.println();
        
        
        Collections.sort(temp);
        System.out.println(temp);
        System.out.println("AVG : " + avg + " , LOWEST : " + temp.get(0) + ", HIGHEST = " + temp.get(14) );
    }
}
