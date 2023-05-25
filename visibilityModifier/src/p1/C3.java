package p1;

public class C3 extends C1 {
    public void accessC1(){
        try{
            System.out.println("accessing c1 from c3:");
    
            m();
            
            System.out.println();
        }
        catch(Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }
    }
}
