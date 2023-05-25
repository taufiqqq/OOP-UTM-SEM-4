package p1;

public class C2 {
public void accessC1(){
    try{
        C1 c = new C1();
        System.out.println("accessing c1 from c2:");
        c.m();
        System.out.println("haha");
    }
    catch(Exception e){
        System.out.println("ERROR " + e.getMessage());
    }
}
}
