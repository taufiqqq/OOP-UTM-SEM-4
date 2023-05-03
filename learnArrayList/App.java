// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Float> temp = new ArrayList<>();
        temp.add(Float.valueOf(12.1f));
        temp.add(3.2f);
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
        
    }
}
