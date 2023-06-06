public class Cat extends Animal  {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    } // type cat must implement abstract method

    @Override
    public void move() {
        System.out.println("*catwalk*");
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
