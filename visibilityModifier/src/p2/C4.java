package p2;

public class C4 extends p1.C1 {
    
    public void accessC1(){
        try{
            System.out.println("accessing c1 from c4:");
    
            m();
            
            System.out.println();
        }
        catch(Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }
    }
}
