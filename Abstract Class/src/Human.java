

public class Human extends Animal {

    public Human(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
    } 
    
    @Override
    public void move() {
        System.out.println("Berjalan kaki");
    }

    @Override
    public void normalMove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'normalMove'");
    }

    @Override
    public void panicMove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'panicMove'");
    }

    @Override
    public void alternativeMove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alternativeMove'");
    }
}
