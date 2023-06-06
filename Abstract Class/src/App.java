interface Move {
    double speed = 10.5; //final double speed = 10.5;

    //enforce standardization/specification
    //cam abstract class standardization , kalau implement move
    void normalMove();
    void panicMove();
    void alternativeMove();

}

public class App {
    public static void main(String[] args) throws Exception {
        // Animal al = new Animal("Haiwan");
        Cat c1 = new Cat("Parsi");
        Snake sn1 = new Snake("Kobra");
        Squid sq1 = new Squid("Ho Se Yong From Squid Game");
        Fish f1 = new Fish("Dugong");
        Human h1 = new Human("Taufiq");

        c1.makeSound();
        c1.move();
        sn1.makeSound();
        sn1.move();
        sq1.makeSound();
        sq1.move();
        f1.makeSound();
        f1.move();
        h1.makeSound();
        h1.move();

        Cuboid kuboid = new Cuboid();
        Pyramid piramid = new Pyramid();
        Sphere sfera = new Sphere();
        Cylinder silinder = new Cylinder();

        System.out.println("Silinder Area: " + silinder.getSurfaceArea() + ", Volume: " + silinder.getVolume());
        System.out.println("Cuboid Area: " + kuboid.getSurfaceArea() + ", Volume: " + kuboid.getVolume());
        System.out.println("Sphere Area: " + sfera.getSurfaceArea() + ", Volume: " + sfera.getVolume());
        System.out.println("Pyramid Area: " + piramid.getSurfaceArea() + ", Volume: " + piramid.getVolume());

    }
}
