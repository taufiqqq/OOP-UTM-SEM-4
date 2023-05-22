import java.util.ArrayList;


class Creature {
    public void makeSound() {
        System.out.println("Creature making a sound.");
    }


    public void move(){
        System.out.println("creature move");
    }
    public void move(String method){
        System.out.println("move by :"+method);
    }


    public void move(int speed){
        System.out.println("moving speed :"+speed);
    }
}


class Cat extends Creature {
    @Override
    public void makeSound() {
        super.makeSound(); //both make sound
        System.out.println("Cat meow.");
    }
}


class Tiger extends Creature {
    @Override
    public void makeSound() {
        System.out.println("Tiger roars.");
    }
}


public class App {
    public static void main(String[] args) {
        Creature animal = new Creature();
        animal.makeSound();
        animal.move();
        animal.move("running on 2 legs");
        animal.move(25);
        animal.makeSound();  // Output: "Animal is making a sound."
        
        System.out.println("\nBreakline\n");

        Cat cat = new Cat();
        cat.makeSound();     // Output: "Cat meow."


        System.out.println("\nBreakline\n");
        
        Tiger t = new Tiger();
        t.makeSound();
        t.move("using 4 legs");


        System.out.println("\nBreakline\n");
        
        ArrayList<Creature> al = new ArrayList<>();
        al.add(0, animal);
        al.add(0, cat);
        al.add(0, t);
        
        System.out.println("\nBreakline\n");


        for (Creature creature : al) {
            creature.makeSound();
        }


    }
}
