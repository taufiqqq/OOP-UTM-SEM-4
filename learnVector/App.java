// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
Vector vname = new Vector(); //vector is a raw type
Vector<String> stringName = new Vector<String>();
//Vector<Student> specifyName = new Vector <>();
        Integer x = Integer.valueOf(10);
        
//vname.add(x);
//vname.add(new Double(12.45));

vname.add("ali");
vname.add("abu");
vname.add("siti");
vname.add(1, "abdullah"); //insert into specific position
vname.set(1, "chua"); //insert into position (overwrite)

System.out.println(vname); //print all elements

vname.remove(1); //remove element at index 1


boolean result = vname.remove("abu"); //remove element at index 1
System.out.println("result is : " +result);
System.out.println("vname capacity : " + vname.capacity()); //print current vector size
System.out.println(vname); //print all elements
System.out.println(vname.elementAt(0));//print the 1st element only
    }
}
