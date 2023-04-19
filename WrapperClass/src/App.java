public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Integer wx = new Integer(10); WRONG
         * Float wb = new Float(10.5);
         * Double wc = new Double(25.5);
         */

        Integer wa = Integer.valueOf(10); // explicit boxing
        Integer wa2 = 10; // auto boxing;
        Float wb = Float.valueOf(10.5f);
        Double wc = Double.valueOf(25.5);
        int a = wa.intValue(); // unboxing
        // int a = wa; //auto unboxing

        /*
         * If Integer a = 128 and Integer b = 128 . If we compare == , it will be false
         * because 128 is more than 1 byte. so 128 use heap memory. Thus memory address
         * is different. But if value is less than 1 byte it will store in constant pool
         * memory. Thus both equal to same location / value
         * If want to compare value, use equals(), do not use == . Java is annoying with
         * == assignment
         */

        System.out.println("Value wa is : " + wa);
        System.out.println("Value wb is : " + wb);
        System.out.println("Value wc is : " + wc);

        System.out.println("Value of a is : " + a);
        System.out.println(wa == wa2);
    }
}
