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
    }
}
