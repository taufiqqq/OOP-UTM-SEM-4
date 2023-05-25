import p1.*;
import p2.*;


public class App {
    public static void main(String[] args) throws Exception {
        C1 c1 = new C1();
        C2 c2 = new C2();
        C3 c3 = new C3();
        C4 c4 = new C4();
        C5 c5 = new C5();

        c2.accessC1();
        c3.accessC1();
        c4.accessC1();
        c5.accessC1();
    }
}
