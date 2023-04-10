public class App {
    public static void main(String[] args) throws Exception {
        // 1st syntax
        String[] aList;
        aList = new String[10];

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

        int i = 0;
        while (i < aChar.length) {
            System.out.println("Value of char " + i + ": " + aChar[i]);
            ++i;
        }

        float largestElement = fNum[0];
        float sum = 0;
        int smallestIndex = 0;
        float smallestElement = fNum[0];

        for (int j = 0; j < fNum.length; j++) {
            System.out.println("List of float [" + j + "] : " + fNum[j]);
            
            sum = sum + fNum[j];
            
            if (fNum[j] > largestElement)
                largestElement = fNum[j];
            
            if (fNum[j] < smallestElement) {
                smallestIndex = j;
                smallestElement = fNum[j];
            }
        }

        System.out.println("Sum of Array: " + sum);
        System.out.println("Largest Element: " + largestElement);
        System.out.println("Smallest Index: " + smallestIndex + " with element of " + smallestElement);
    }
}
