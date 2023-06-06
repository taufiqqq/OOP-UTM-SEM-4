public class Pizza {
    private String description;
    private Size saiz;

    public Pizza(String description, String s){
        this.description = description;
        
        if(s.equals("S")) this.saiz = Size.S;
        else if(s.equals("R")) this.saiz = Size.R;
        else if(s.equals("L")) this.saiz = Size.L;
        else System.out.println("ERROR");
    }

    public String getDescription(){
        return description;
    }

    public Size getPizzaSize(){
        return saiz;
    }
}
