
public class Snake extends Animal {

    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("psssss psssss");
    } 
    
    @Override
    public void move() {
        System.out.println("slithering in your dms");
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
