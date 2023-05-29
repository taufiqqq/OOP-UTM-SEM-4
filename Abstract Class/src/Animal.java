public abstract class Animal  implements Move{ // need to put abstract class, as one of the method has abstract implementation
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("zzz....");
    }

    // public void makeSound(); //wrong if no put abstract
    public abstract void makeSound(); // Every animal has make sound function. but do not know how to implement for
                                      // parent class. the subclass will overwrite the implementation
                                      // (public/protected)

    public abstract void move();
}


