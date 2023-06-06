
public class Squid extends Animal {

    public Squid(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("psh psh psh");
    }

    @Override
    public void move() {
        System.out.println("*squid swim* splsh splsh");
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

