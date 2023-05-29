public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bloob Blooob");
    } 

    @Override
    public void move() {
        System.out.println("*Swim and smackching its tail*");
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