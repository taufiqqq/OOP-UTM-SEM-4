import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 1st syntax
        String[] aList = { "ali", "mia", "dila", "fau", "jak", "din" };
        // 2nd syntax
        int[] aNum = new int[10]; // or int aNum[] = new int[10];


        // 3rd
        float fNum[] = { 34.5f, 12.5f, 11.2f, 15.0f, -10.5f, 101f, -1f };
        // call a method to display all elements in fNum
        // displayAll(fNum);
        // displayAll(aList); //to print all names
        // implement method to sum the value of fNum
        // float result = sumMethod(fNum);
        // System.out.println("sum is : "+result);


        // float highest = findHighest(fNum);
        // System.out.println("highest is : "+highest);
        System.out.println("orig fNum : ");
        displayAll(fNum);
        // swapValue(fNum[0],fNum[fNum.length-1]);
        swapValue2(fNum);
        System.out.println("\nfNum after method call: ");
        displayAll(fNum);

        s.close();
    }


    private static void swapValue2(float[] x) {
        float temp = x[0];
        x[0] = x[x.length - 1];
        x[x.length - 1] = temp;
    }


    private static void swapValue(float f, float l) {
        float temp = f;
        f = l;
        l = temp;
    }


    private static float sumMethod(float[] abc) {
        float sum = 0;
        for (float temp : abc) {
            sum = sum + temp;
        }
        return sum;
    }


    private static void displayAll(float[] xyz) {
        for (float temp : xyz) {
            System.out.print(temp);
        }
    }


    public static void displayAll(String[] nameList) {
        for (String temp : nameList) {
            System.out.println(temp);
        }
    }


    // public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    // String[] aList = new String[10];


    // System.out.println("aList[0] = " + aList[0]);
    // for (int i = 0; i < aList.length; i++)
    // System.out.println("aList[0] = " + aList[i]);
    // }
}
