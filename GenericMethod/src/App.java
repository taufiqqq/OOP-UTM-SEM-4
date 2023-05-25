import java.util.ArrayList;

class Creature {
    public void makeSound() {
        System.out.println("Creature making a sound.");
    }
}

class Human extends Creature {
    @Override
    public void makeSound() {
        super.makeSound(); // both make sound
        System.out.println("I like money money");
    }
}

class Tiger extends Creature {
    @Override
    public void makeSound() {
        System.out.println("Rawr");
    }
}

public class App {
    public static void main(String[] args) {
        Creature c = new Creature();
        Human h = new Human();
        Tiger t = new Tiger();

        printDetails(t);
        printDetails(h);
        printDetails(c);
        printDetails(3);
        printDetails("Monkey");

        //printParentDetails(h);
    }

    //generic method
    public static <T> void printDetails(T t) {
        System.out.println("Creature Details");
        System.out.println("Type: " + t.getClass().getSimpleName());
        System.out.println("--------------------------");
    }

    public static <T> void printParentDetails(T t) {
        System.out.println(t.getClass());
        System.out.println("Parent: " + t.getClass().getSuperclass().getSimpleName());
        System.out.println("--------------------------");
    }
}

/* public class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};


        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("\nString Array:");
        printArray(stringArray);

        //casting
        Object s = new Student("ALi", "MALE");

        if (s instanceof Student)
        Student s1 = (Student)s;
        //instance casting
    }
}
 */