import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        // 1st syntax
        String[] aList = { "Najwan", "Sam", "Fique", "Luqman", "Am", "Ika", "Auni", "Arshad", "Mankal", "Marul" };

        // 2nd syntax
        int[] aNum = new int[10];
        // or int aNum[] = new int[10];

        // 3rd syntax
        char[] aChar = { 'A', 'B', 'C', 'D' };
        // or char aChar[] = {'A', 'B', 'C', 'D'};

        float fNum[] = { 34.5f, 12.5f, 11.2f, 15.0f, -10.5f, 101f, -1f };

        for (int i = 0; i < aNum.length; i++) {
            System.out.println("Value of int [" + i + "] : " + aNum[i]);
        }

        for (String a : aList) {
            System.out.println("Value of String : " + a);
        }

        int position = 0;
        while (position < aChar.length) {
            System.out.println("Value of char " + position + ": " + aChar[position]);
            ++position;
        }

        displayAll(aList);
        displayAll(fNum);
        
        swapValue(fNum);
        System.out.println("Swapped Element:-");
        displayAll(fNum);
        
        float result = sumMethod(fNum);
        float largest = findLargest(fNum);
        float smallest = findSmallest(fNum);
        
        System.out.println("Sum = " + result);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        s.close();
    }

    private static void displayAll(float[] xyz) {
        for (float temp : xyz) {
            System.out.println("Element : " + temp);
        }
    }

    private static void displayAll(String[] xyz) {
        for (String temp : xyz) {
            System.out.println("Declared method : " + temp);
        }
    }

    private static float sumMethod(float[] listFloat) {
        float sum = 0;
        for (float f : listFloat) {
            sum += f;
        }
        return sum;
    }

    private static float findLargest(float[] listFloat) {
        float largest = listFloat[0];
        for (float f : listFloat) {
            if (f > largest) {
                largest = f;
            }
        }
        return largest;
    }

    private static float findSmallest(float[] listFloat) {
        float smallest = listFloat[0];
        for (float f : listFloat) {
            if (f < smallest) {
                smallest = f;
            }
        }
        return smallest;
    }

    private static void swapValue(float[] listFloat){
        float temp = listFloat[listFloat.length-1];
        listFloat[listFloat.length-1] = listFloat[0];
        listFloat[0] = temp;
    }

}
